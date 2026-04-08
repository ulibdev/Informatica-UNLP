using System;

namespace teoria2;

public class Hora
{
    private object horas;
    private int minutos;
    private object segundos;

    public Hora(int horas,int minutos,int segundos)
    {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Hora(double horas)
    {
        double aux = 60 * ( horas % 1);
        this.horas = (int)horas;
        this.minutos = (int)aux;
        aux = 60 *(aux % 1);
        if(aux >= 59.9999)
        {
            this.segundos = 0;
            this.minutos+=1;
        }else this.segundos = aux;
    }


    public void Imprimir()
    {
        if(segundos is double){
            Console.WriteLine($"{horas} horas,{minutos} minutos, {segundos:0.000} segundos");
        }else Console.WriteLine($"{horas} horas,{minutos} minutos, {segundos} segundos");
    }
}
