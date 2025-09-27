/*
 3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals.
 */
package tema2;

import PaqueteLectura.Lector;

public class Ej03Casting {
    
    public static void main(String[] args){
        Persona [][]matriz = new Persona[5][8];
        int dni,edad,dimlF=0,dimlC,cantPersonas=0;
        
        System.out.println("Nombre:");
        String nombre = Lector.leerString();
        while(!nombre.equals("ZZZ")&& (dimlF < 5)){
            dimlC = 0;
            while((!nombre.equals("ZZZ")) && (dimlC <8)){
                System.out.println("Edad:");
                edad=Lector.leerInt();
                System.out.println("Dni:");
                dni=Lector.leerInt();
                matriz[dimlF][dimlC] = new Persona(nombre,dni,edad);
                cantPersonas++;
                System.out.println("Nombre:");
                nombre = Lector.leerString();
                dimlC++;
            }
            dimlF++;
        }
        dimlF=0;
        dimlC=0;
        while(cantPersonas > 0){
            System.out.println(matriz[dimlF][dimlC].toString());
            dimlC++;
            if( dimlC >7){
            dimlF++;
            dimlC = 0;
            }
            cantPersonas--;
        }
    }
        
}
    

