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



    public static int[] Donde(this int[] vector, Predicado p)
    {
        List<int> resultadoTemp = new List<int>(vector.Length);
        for (int i = 0; i < vector.Length; i++)
        {
            if (p(vector[i]))
            {
                resultadoTemp.Add(vector[i]);
            }
        }
        return resultadoTemp.ToArray();
    }

}