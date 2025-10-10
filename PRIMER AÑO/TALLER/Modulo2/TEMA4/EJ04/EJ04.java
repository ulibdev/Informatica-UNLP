
package tema4.EJ04;

import PaqueteLectura.GeneradorAleatorio;


public class EJ04 {

    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Estacion estacion = new Estacion("La Plata",-34.921,-57.955);
        SistemaAnual anual = new SistemaAnual(estacion, 3, 2021);
        for (int i=0; i<3;i++){
            for (int j=0; j<12;j++){
                anual.setTemperatura(GeneradorAleatorio.generarDouble(100)+100, j, i+2021);
            }
        }
        System.out.println(anual.toString());
        System.out.println(anual.mayorTempertura());
         
        Estacion estacion2 = new Estacion("Mar del Plata",-38.002,-57.556);
        SistemaMensual mensual = new SistemaMensual(estacion2, 4, 2020);
        for (int i=0; i<4;i++){
            for (int j=0; j<12;j++){
                mensual.setTemperatura(GeneradorAleatorio.generarDouble(100)+100, j, i+2020);
            }
        }
        System.out.println(mensual.toString());
        System.out.println(mensual.mayorTempertura());
        
    }
    
}
