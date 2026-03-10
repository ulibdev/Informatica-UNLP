/*
   12) Escribir un programa que imprima todos los divisores de un número entero ingresado desde la
    consola. Para obtener el entero desde un string st utilizar int.Parse(st).
*/


int num = int.Parse(Console.ReadLine());
for (int i=1;i<= num; i++)
{
    if(num % i == 0)Console.WriteLine(i);
} 
Console.ReadKey();



