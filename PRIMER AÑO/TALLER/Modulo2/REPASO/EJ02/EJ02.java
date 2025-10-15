
package Tema5.EJ02;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;


public class EJ02 {

    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
       Estacionamiento estacion = new Estacionamiento(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarString(5),"1:00","2:00",3,3);
       Auto auto;
       for(int i=0;i <6;i++){
           auto = new Auto(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarString(5));
           estacion.registrarAuto(auto, GeneradorAleatorio.generarInt(3)+1, GeneradorAleatorio.generarInt(3)+1);
       }
       
        System.out.println(estacion.toString());
        System.out.println(estacion.retornarCantAutos(1));
        System.out.println("Patente a buscar:");
        String patente = Lector.leerString();
        System.out.println(estacion.buscarAutoPatente(patente));
    }
    
}
