/*
3) Implementar el método ImprimirMatrizConFormato, similar al anterior pero ahora con un
parámetro más que representa la plantilla de formato que debe aplicarse a los números al imprimirse.
La plantilla de formato es un string de acuerdo a las convenciones de formato compuesto, por ejemplo
“0.0” implica escribir los valores reales con un dígito para la parte decimal.
*/

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

