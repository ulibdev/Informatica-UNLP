/*
   16) Analizar el siguiente código. ¿Cuál es la salida por consola?
   cero
   cero
   1
    
*/

int i = 1;
if (--i == 0)
{
Console.WriteLine("cero");
}
if (i++ == 0)
{
Console.WriteLine("cero");
}
Console.WriteLine(i);

Console.ReadKey();



