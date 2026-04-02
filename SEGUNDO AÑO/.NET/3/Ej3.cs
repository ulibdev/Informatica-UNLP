
void ImprimirMatrizConFormato(double[,] matriz, string formatString)
{
    for(int i = 0; i < matriz.GetLength(0); i++)
    {
        for(int j = 0; j < matriz.GetLength(1); j++)
        {
            Console.Write(matriz[i,j].ToString(formatString) + ",");
        }
        Console.WriteLine();
    }
}


double[,] mat = new double[,]
{ {1.001,2.02,3.3,4.0},
{5,6,7,8},
{9,10,11,12} };

Console.WriteLine(mat.GetLength(0));

Console.WriteLine(mat.GetLength(1));
ImprimirMatrizConFormato(mat,"0.00");

