/*
4) Dada la siguiente clase genérica
Utilizar la clase Nodo<T> para codificar codificar una lista enlazada genérica tal manera que el código
siguiente produzca la salida indicada:

0 100 3 10 11
*/

using teoria9;

var lista = new ListaEnlazada<int>();
lista.AgregarAdelante(3);
lista.AgregarAdelante(100);
lista.AgregarAtras(10);
lista.AgregarAtras(11);
lista.AgregarAdelante(0);
IEnumerator<int> enumerador = lista.GetEnumerator();
while (enumerador.MoveNext())
{
int i = enumerador.Current;
Console.Write(i + " ");
}
Console.WriteLine();