/*
1) Codificar el método genérico Get para que el siguiente código produzca la salida en la consola
indicada.

hola 7 A
*/


List<object> lista = [ "hola", 7, 'A' ];
string st = Get<string>(lista, 0);
int i = Get<int>(lista, 1);
char c = Get<char>(lista, 2);
Console.WriteLine($"{st} {i} {c}");

T Get<T>(List<object> l, int i)
{
    return (T)l[i];
}