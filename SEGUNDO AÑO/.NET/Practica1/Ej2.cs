/*
    2) Investigar por las secuencias de escape \n, \t , \" y \\. Escribir un programa que las utilice para
    imprimir distintos mensajes en la consola.
    \n = Salto de linea
    \t = Equivalente a un tabulador
    \ = permite imprimir secuencias de escape como las anteriores
    \\ = permite imprimir \ ya que sino lo considera secuencia de escape
*/

Console.Write("Hello \n World");
Console.ReadKey();
Console.WriteLine();
Console.Write("Hello \t World");
Console.ReadKey();
Console.WriteLine();
//Console.Write("Hello \ World"); 
//Console.ReadKey();
//Console.WriteLine();
Console.Write("Hello \\ World");
Console.ReadKey();



