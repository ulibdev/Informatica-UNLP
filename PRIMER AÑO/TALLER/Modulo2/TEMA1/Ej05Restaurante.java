/*
 El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.
 */
package tema1;

import PaqueteLectura.Lector;


public class Ej05Restaurante {

    public static void main(String[] args) {
	int [][]matriz = new int[5][4];
        int acumulado,i,j;
        
        for(i=0;i<5;i++){
            System.out.println("Atencion al cliente:");
            matriz[i][0]=Lector.leerInt();
            System.out.println("Calidad de la comida:");
            matriz[i][1]=Lector.leerInt();
            System.out.println("Precio:");
            matriz[i][2]=Lector.leerInt();
            System.out.println("Ambiente:");
            matriz[i][3]=Lector.leerInt();
        }
        
        for(j=0;j<4;j++){
            acumulado=0;
            for(i=0;i<5;i++){
                acumulado += matriz[i][j];
            }
            System.out.println("Promedio["+j+"] = "+(acumulado/5));
        }
    }
}
