/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI.

 */
package tema2;

public class Ej02Persona {
    //utiliza un objeto del tipo persona previamente hecho
    public static void main(String[] args){
        Persona []p = new Persona[15];
        int dni;
        String nombre;
        int diml=0, edad = PaqueteLectura.GeneradorAleatorio.generarInt(100);
        
        while((diml<15) &&(edad != 0)){
            dni = PaqueteLectura.GeneradorAleatorio.generarInt(10000);
            nombre = PaqueteLectura.GeneradorAleatorio.generarString(5);
            p[diml] = new Persona(nombre,dni,edad);
            diml++;
            edad = PaqueteLectura.GeneradorAleatorio.generarInt(100);
        }
        //preguntar si va el new persona realmente porque hay metodos para cambiar nombre
        int cantPersonas=0;
        Persona min = new Persona("minimo",10000,0);
        for(diml=0;diml<15;diml++){
            if(p[diml].getEdad() > 65)cantPersonas++;
            if(p[diml].getDNI() < min.getDNI()) min=p[diml];
        }
        System.out.println("La cantidad de personas con +65 es "+cantPersonas);
        System.out.println(min.toString());
        
    }
    
}
