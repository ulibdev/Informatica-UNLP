using System;

namespace teoria7;

public class Perro : IAtendible, IVendible, ILavable,INombrable
{
    public required string Nombre{get;init;}

    public int CompareTo(object? caso)
    {
        if (caso == null) return 1;
        if (caso is INombrable p)
        {
            return this.Nombre.CompareTo(p.Nombre);
        }
        throw new ArgumentException("El objeto a comparar no es de tipo INombrable");
    }

    public override string ToString()
    {
        return Nombre + " es un perro";
    }
    public void Atender()
    {
        Console.WriteLine("Atendiendo perro");
    }

    public void Vender(Persona p)
    {
        Console.WriteLine("Vendiendo perro a persona");
    }
    public void Lavar()
    {
        Console.WriteLine("Lavando perro");
    }
    public void Secar()
    {
        Console.WriteLine("Secando perro");
    }
}
