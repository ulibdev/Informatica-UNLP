
using System.Numerics;

namespace teoria8;
static class VectorDeEnterosExtension
{
public static void Print(this int[] vector, string leyenda)
{
Console.WriteLine(leyenda + string.Join(", ", vector));
}
public static int[] Seleccionar(this int[] vector,FuncionEntera x) {
    int[]vector2 = new int[vector.Length];
    for(int i= 0; i<vector.Length;i++)
        {
            vector2[i] = x(vector[i]);
        }
    return vector2;
}
}