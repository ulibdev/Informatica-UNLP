using System;

namespace teoria7;

public class Pelicula : IAlquilable
{
    public virtual void SeAlquilaA(Persona p)
    {
        Console.WriteLine("Alquilando pelicula a persona");
    }
    public virtual void Devolver(Persona p)
    {
        Console.WriteLine("Pelicula devuelta por persona");
    }
}
