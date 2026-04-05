bool balance(String s)
{
    Stack<Char> pila = new Stack<char>();

    for(int i = 0; i < s.Length; i++)
    {
        if(s[i].Equals('('))
        {
            pila.Push(s[i]);
            
        }else if (s[i].Equals(')'))
        {
            if(pila.Count == 0)
            {
                return false;
            }else pila.Pop();
        }
    }
    if(pila.Count > 0)return false;
    else return true;
}

String holaquehace = "((((a)))";
bool a = balance(holaquehace);

Console.WriteLine(a);