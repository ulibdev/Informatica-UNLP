
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej03Matrices {

    public static void main(String[] args) {
	GeneradorAleatorio.iniciar();
	
        int DMF = 5,i,j,acumulado,valor;
        int[][]matriz = new int[DMF][DMF];
        int []vector = new int[DMF];
        boolean encontrado = false;
        
        
        for (i = 0;i<DMF;i++){
            for (j = 0; j<DMF;j++){ 
                matriz[i][j]= GeneradorAleatorio.generarInt(31);
            }
        }
        for (i=0;i<DMF;i++){
            for(j = 0; j<DMF;j++){
                System.out.println("["+i+"]"+"["+j+"] = "+matriz[i][j]);
            }
        }
        acumulado=0;
        for(j=0;j<DMF;j++){
           acumulado+=matriz[1][j]; 
            
        }
        System.out.println("la Suma de la fila 1 es "+acumulado);    
        
        for(j=0;j<DMF;j++){
            acumulado=0;
            for(i =0;i<DMF;i++){
                acumulado+=matriz[i][j]; 
            }
            vector[j]=acumulado;
        }
        
        for (i = 0; i<DMF;i++) System.out.println("VECTOR["+i+"] = "+ vector[i]);  
        System.out.println("que valor desea buscar?");
        valor = Lector.leerInt();
        i=0;
        while((i<DMF) && (!encontrado)){
            while(j<DMF){
                if(matriz[i][j] == valor) {
                    encontrado = true;
                    System.out.println("SE ENCONTRO VALOR EN"+"["+i+"]"+"["+j+"]");
                }
                j++;
            }
            j=0;
            i++;
        }
        if(!encontrado)System.out.println("no se encontro el valor");

    }
}
