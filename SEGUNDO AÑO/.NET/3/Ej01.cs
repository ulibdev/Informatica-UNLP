/*
1) Ejecutar y analizar cuidadosamente el siguiente programa:

dice none f f 
se refiere al modificador, la tecla y el caracter de la tecla presionada
*/

Console.CursorVisible = false;
ConsoleKeyInfo k = Console.ReadKey(true);
while (k.Key != ConsoleKey.End)
{
Console.Clear();
Console.Write($"{k.Modifiers}-{k.Key}-{k.KeyChar}");
k = Console.ReadKey(true);
}