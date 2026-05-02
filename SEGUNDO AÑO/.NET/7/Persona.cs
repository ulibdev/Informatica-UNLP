using System;

namespace teoria7;

public class Persona : IAtendible
{
    public void Atender()
    {
        Console.WriteLine("Atendiendo persona");
    }
}
