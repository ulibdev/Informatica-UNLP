using System;

namespace teoria7;

public class Persona : IAtendible, INombrable
{
    public required string Nombre{get;init;}


    public void Atender()
    {
        Console.WriteLine("Atendiendo persona");
    }

    public override string ToString()
    {
        return Nombre + " es una persona.";
    }
    public int CompareTo(object? caso)
    {
        if (caso == null) return 1;
        if (caso is INombrable p)
        {
            return this.Nombre.CompareTo(p.Nombre);
        }
        throw new ArgumentException("El objeto a comparar no es de tipo INombrable");
    }
}
