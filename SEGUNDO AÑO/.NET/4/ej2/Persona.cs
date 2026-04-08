using System;

namespace teoria2;

public class Persona(string nombre,int edad, int dni)
{

    
    
    public void Imprimir()
    {
        Console.Write($"{nombre,-20} {edad,-20} {dni,-20}");
    }


}
