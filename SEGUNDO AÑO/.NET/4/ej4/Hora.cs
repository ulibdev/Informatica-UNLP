using System;

namespace teoria2;

public class Hora(int horas,int minutos,int segundos)
{
    public void Imprimir()
    {
        Console.WriteLine(horas + " horas," + minutos +" minutos,"+ segundos + " segundos.");
    }
}
