using System;

namespace teoria2;

public class Persona(string nombre,int edad, int dni)
{

    
    public int getEdad()
    {
        return edad;
    }
    public void Imprimir()
    {
        Console.Write($"{nombre,-20} {edad,-20} {dni,-20}");
    }
    public bool EsMayorQue(Persona p)
    {
        if(edad > p.getEdad())
        {
            return true; 
        }else return false;
    }

}
