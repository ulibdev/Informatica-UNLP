using System;

namespace teoria7;

public class Libro : IAlquilable,IReciclable
{
    public void SeAlquilaA(Persona p)
    {
        Console.WriteLine("Alquilando libro a persona");
    }
    public void Devolver(Persona p)
    {
        Console.WriteLine("Libro devuelto por persona");
    }
    public void Reciclar()
    {
        Console.WriteLine("Reciclando libro");
    }
}
