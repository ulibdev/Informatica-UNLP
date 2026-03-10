/*
    9)Escribir un programa que lea dos palabras separadas por un blanco que terminan con <ENTER>, y
    determinar si son simétricas (Ej: 'abbccd' y 'dccbba' son simétricas).
    Tip: si st es un string, entonces st[0] devuelve el primer carácter de st, y st[st.Length-1]
    devuelve el último carácter de st.
*/
Console.WriteLine("Diga su palabra");    
string st1 = Console.ReadLine();
Console.WriteLine("Diga su segunda palabra");
string st2 = Console.ReadLine();


bool sim = false;
if(st1.Length == st2.Length)
{
    for (int i = 0; i<=st1.Length - 1; i++)
    {
        if (st1[i].Equals(st2[st2.Length - 1 - i]))
        {
            sim = true;
        }else
        {
            sim = false;
            break;
        }
    }
}

Console.WriteLine(sim);
Console.ReadKey();



