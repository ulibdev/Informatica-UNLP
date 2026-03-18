/*
16) Escribir un programa que reciba una lista de nombres como parámetro por la línea de comandos e
imprima por consola un saludo personalizado para cada uno de ellos.
a) Utilizando la sentencia for
b) Utilizando la sentencia foreach

*/

//a) con args.Length es la cantidad de elementos asi que utilizo eso para calcular el limite

for(int i=0;i<= args.Length-1; i++)
{
    Console.WriteLine("Holaaaa {0}",args[i]);
}
//b)
foreach(string a in args)
{
    Console.WriteLine("Holaaaa " + a);
}

