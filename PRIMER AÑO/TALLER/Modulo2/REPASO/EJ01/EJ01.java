
package Tema5.EJ01;

import PaqueteLectura.GeneradorAleatorio;


public class EJ01 {

    
    public static void main(String[] args) {
       GeneradorAleatorio.iniciar();
       Proyecto proyecto = new Proyecto("PASCALI",GeneradorAleatorio.generarInt(100)+100,"George");
       String nombre="";
       for(int i = 0;i<3;i++){
        nombre = GeneradorAleatorio.generarString(5);
       Investigador investigadores = new Investigador(nombre,GeneradorAleatorio.generarInt(5)+1,GeneradorAleatorio.generarString(5));
       Subsidio unSubsidio= new Subsidio(GeneradorAleatorio.generarDouble(300)+500,GeneradorAleatorio.generarString(5));
       investigadores.agregarSubsidio(unSubsidio);
       proyecto.agregarInvestigador(investigadores);
       }
       proyecto.otorgarTodos(nombre);
        System.out.println(proyecto.toString());
    }
    
}
