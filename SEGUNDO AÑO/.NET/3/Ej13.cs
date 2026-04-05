
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