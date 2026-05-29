using System;

namespace teoria9;

public class Persona()
{
    public string Nombre{get;init;}
    public int Edad{get;init;}

    public override string ToString()
    {
        return Nombre + " de " + Edad + " años";
    }
}
