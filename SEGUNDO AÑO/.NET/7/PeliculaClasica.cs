using System;

namespace teoria7;

public class PeliculaClasica : Pelicula, IVendible
{
    
    public override void SeAlquilaA(Persona p)
    {
        Console.WriteLine("Alquilando película clásica a persona");
    }


    public override void Devolver(Persona p)
    {
        Console.WriteLine("Pelicula clasica devuelta por persona");
    }
    public void Vender(Persona p)
    {
        Console.WriteLine("Vendiendo película clásica a persona");
    }
}
