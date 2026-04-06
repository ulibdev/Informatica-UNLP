/*
13) Utilizar la clase Stack<T> (pila) para implementar un programa
que pase un número en base 10 a otra base realizando divisiones
sucesivas. Por ejemplo para pasar 35 en base 10 a binario dividimos
sucesivamente por dos hasta encontrar un cociente menor que el
divisor, luego el resultado se obtiene leyendo de abajo hacia arriba el
cociente de la última división seguida por todos los restos.
*/
void binario(int n)
{
    Stack<int>pila = new Stack<int>();
    while(n != 0)
    {
        pila.Push(n%2);
        n = n/2;
    }
    while(pila.Count > 0)
    {
        Console.Write(pila.Pop());
    }
}

binario(35);