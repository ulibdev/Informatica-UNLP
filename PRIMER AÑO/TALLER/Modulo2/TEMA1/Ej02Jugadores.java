
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos

import PaqueteLectura.Lector;
public class Ej02Jugadores {

  
    public static void main(String[] args) {
        int DMF = 15;
        double []vector = new double[DMF];
        
        double promAltura,altura,totalAltura = 0;
        int i,cantJugadores = 0;
        
        for (i=0;i<DMF;i++){
            System.out.println("ingrese una Altura:");
            altura = Lector.leerDouble();
            vector[i]=altura;
            totalAltura += altura;
        }
                
        promAltura = totalAltura/(double)DMF;
        
        System.out.println("Promedio es:"+promAltura);
        
        for (i=0;i<DMF;i++){
            if(promAltura < vector[i]) cantJugadores++;
        }
        
        System.out.println("cantidad de jugadores que supera la altura:"+cantJugadores);
        
    }
    
}
