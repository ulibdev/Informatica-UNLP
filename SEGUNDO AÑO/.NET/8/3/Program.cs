/*
3) Codificar usando iteradores los métodos:
Rango(i, j, p) que devuelve la secuencia de enteros desde i hasta j con un paso de p
Potencia(b,k) que devuelve la secuencia b1,b2,....bk

DivisiblePor(e,i) retorna los elementos de e que son divisibles por i
Observar la salida que debe producir el siguiente código:
*/
using System.Collections;
IEnumerable rango = Rango(6, 30, 3);
IEnumerable potencias = Potencias(2, 10);
IEnumerable divisibles = DivisiblesPor(rango, 6);
foreach (int i in rango)
{
Console.Write(i + " ");
}
Console.WriteLine();
foreach (int i in potencias)
{
Console.Write(i + " ");
}
Console.WriteLine();
foreach (int i in divisibles)
{
Console.Write(i + " ");
}
Console.WriteLine();





IEnumerable Rango(int i, int j, int p)
{
    while (i <= j)
    {
        yield return i;
        i += p;
    }
}

IEnumerable Potencias(int b, int k)
{
    for(int a = 1; a <= k ; a++)
    {
        yield return (int)Math.Pow(b,a);
    }
}

IEnumerable DivisiblesPor(IEnumerable e, int i)
{
    foreach(int j in e)
    {
        if(j % i == 0)yield return j;
    }
}