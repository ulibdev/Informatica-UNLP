using System;

namespace teoria5;

public class Persona
{
    public required string Nombre{get;set;}
    public char Sexo{get;set;}
    public int Dni{get;set;}
    public DateTime FechaDeNacimiento{get;set;}

    public int Edad{
        get =>  (int)((DateTime.Now - FechaDeNacimiento).TotalDays / 365.25);
    }

    public object this[int i]
    {
        get => i switch
        {
            0 => Nombre,
            1 => Sexo,
            2 => Dni,
            3 => FechaDeNacimiento,
            4 => Edad,
            _  => throw new IndexOutOfRangeException("Error indice fuera de rango")
        };
        set
        {
            switch (i)
            {
                case 0: Nombre = (string)value;break;
                case 1: Sexo = (char)value;break;
                case 2: Dni = (int)value;break;
                case 3: FechaDeNacimiento = (DateTime)value;break;
                case 4: break;
                default: throw new IndexOutOfRangeException("Error indice fuera de rango");
            }       
        }
    }
    

}
