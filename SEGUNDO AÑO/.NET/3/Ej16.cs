/*
16) ¿Qué salida por la consola produce el siguiente código?
error division por zero

*/

int x = 0;
try
{
Console.WriteLine(1.0 / x);
Console.WriteLine(1 / x);
Console.WriteLine("todo OK");
}
catch (Exception e)
{
Console.WriteLine(e.Message);
}