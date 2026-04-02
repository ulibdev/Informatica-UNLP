

double[] GetDiagonalPrincipal(double[,] matriz)
{
    if(matriz.GetLength(0) == matriz.GetLength(1))
    {
        double[] vector = new double[matriz.GetLength(0)];
        for(int i=0;i< matriz.GetLength(0); i++)
        {
            vector[i]=matriz[i,i];
        }
        return vector;
    }else throw new ArgumentException();
}
double[] GetDiagonalSecundaria(double[,] matriz)
{
    if(matriz.GetLength(0) == matriz.GetLength(1))
    {
        double[] vector = new double[matriz.GetLength(0)];
        for(int i=0;i<matriz.GetLength(0);i++)
        {
            vector[i]=matriz[i,matriz.GetLength(0)-1-i];
        }
        return vector;
    }else throw new ArgumentException();
}

double[,] matriz = new double[,]
{ {1,2,3},
{5,6,7},
{9,10,11} };

double[] vector = GetDiagonalPrincipal(matriz);
for(int i = 0; i < 3; i++)
{
    Console.WriteLine(vector[i]);
}



vector = GetDiagonalSecundaria(matriz);
for(int i = 0; i < 3; i++)
{
    Console.WriteLine(vector[i]);
}
