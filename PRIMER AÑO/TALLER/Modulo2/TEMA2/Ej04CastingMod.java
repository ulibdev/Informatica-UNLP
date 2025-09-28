/*
 4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos
de casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.
 */
package tema2;

import PaqueteLectura.Lector;


public class Ej04CastingMod {
    
    public static void main(String[] args){
        Persona [][]matriz = new Persona[5][8];
        int []diasOcupado = new int[5];
        int dni,edad,cantPersonas=0;
        
        int i,j;
        for (i=0;i<5;i++){
                diasOcupado[i]=0;
        }
        
        int dia;
        System.out.println("Nombre:");
        String nombre = Lector.leerString();
        while(!nombre.equals("ZZZ") && cantPersonas <40){
            System.out.println("Edad:");
            edad = Lector.leerInt();
            System.out.println("Dni:");
            dni = Lector.leerInt();
            System.out.println("Dia:");
            dia = Lector.leerInt();
            while(diasOcupado[dia-1] >7){
                System.out.println("Dia ocupado, elija otro:");
                dia = Lector.leerInt();
            }
            
            matriz[dia-1][diasOcupado[dia-1]] = new Persona(nombre,dni,edad);
            diasOcupado[dia-1]++;
            System.out.println("Nombre:");
            nombre = Lector.leerString();
            cantPersonas++;
        }
        
        i=0;
        while(i<5){
            System.out.println("Dia:"+(i+1));
            System.out.println("CantInscriptos:"+diasOcupado[i]);
            for (j=0;j < diasOcupado[i];j++){
                System.out.println("Turno "+ (j+1) + " :"+ matriz[i][j].getNombre());
            }
            i++;
        }
        
    }
    
}
