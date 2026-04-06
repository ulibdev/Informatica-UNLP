/*
2) Implementar un método para imprimir por consola todos los elementos de una matriz (arreglo de dos
dimensiones) pasada como parámetro. Debe imprimir todos los elementos de una fila en la misma línea
en la consola.
*/


void ImprimirMatriz(double[,] matriz)
{
    for(int i = 0; i < matriz.GetLength(0); i++)
    {
        for(int j = 0; j < matriz.GetLength(1); j++)
        {
            Console.Write(matriz[i,j] + ",");
        }
        Console.WriteLine();
    }
}

double[,] mat = new double[,]
{ {1,2,3,4},
{5,6,7,8},
{9,10,11,12} };

Console.WriteLine(mat.GetLength(0));

Console.WriteLine(mat.GetLength(1));
ImprimirMatriz(mat);

