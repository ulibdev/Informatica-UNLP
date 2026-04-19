using System;

namespace teoria5;

class Libro
{
    public required string ISBN{get;init;}
    public required DateTime? FechaPublicacion{get;init;}
    public required string Titulo{get;init;}
    public double Precio{get;set;}
}
