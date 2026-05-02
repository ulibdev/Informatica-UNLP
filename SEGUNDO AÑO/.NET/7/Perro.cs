using System;

namespace teoria7;

public class Perro : IAtendible, IVendible, ILavable
{
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
