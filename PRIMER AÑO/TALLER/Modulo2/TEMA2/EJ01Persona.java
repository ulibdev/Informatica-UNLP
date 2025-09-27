/*
 Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
 muestre en consola la representación de ese objeto en formato String. 
 */
package tema2;

import PaqueteLectura.Lector;

public class EJ01Persona {
    //utiliza un objeto del tipo persona previamente hecho
    public static void main(String[] args){
        System.out.println("Ingrese nombre:");
        String nombre = Lector.leerString();
        System.out.println("Ingrese dni:");
        int dni = Lector.leerInt();
        System.out.println("Ingrese edad:");
        int edad = Lector.leerInt();
        Persona persona = new Persona(nombre,dni,edad);
        System.out.println(persona.toString());
        
    }
    
}
