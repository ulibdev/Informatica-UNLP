/*
    10) Escribir un programa que imprima en la consola todos los múltiplos de 17 o de 29 comprendidos
    entre 1 y 1000.
*/

int i = 1;
while (i <1000)
{
   if(i%17 ==0 | i %29 == 0)Console.WriteLine(i);
    i++;
}
Console.ReadKey();



