/*
 3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados 

(ii) devolver si el estante está lleno

(iii) agregar un libro al estante 

(iv) devolver el libro con un título particular que se recibe.

B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
 */
package tema3;

import PaqueteLectura.Lector;


public class EJ03Estante {

    public static void main(String[] args) {
       Autor autor;
       Libro libro; 
       
       Estante estante = new Estante();
       
       String titulo,editorial,isbn,nombreAutor, biografia,origen;
       int añoEdicion;
       double precio;
       
       while(!estante.getLleno()){
           System.out.println("Titulo");
           titulo = Lector.leerString();
           
           System.out.println("Editorial");
           editorial =Lector.leerString();
           
           System.out.println("ISBN");
           isbn = Lector.leerString();
           
           System.out.println("Año edicion");
           añoEdicion = Lector.leerInt();
           
           System.out.println("Precio");
           precio = Lector.leerDouble();
           
           System.out.println("Autor nombre");
           nombreAutor = Lector.leerString();
           
           System.out.println("Biografia");
           biografia = Lector.leerString();
           
           System.out.println("Origen");
           origen = Lector.leerString();
           
           autor = new Autor(nombreAutor,biografia, origen);
           libro = new Libro(titulo, editorial, añoEdicion, autor, isbn, precio);
           estante.agregarLibro(libro);
           
       }
       
        System.out.println(estante.getLibro("Mujercitas").getPrimerAutor().getNombre());
       
       
    }
    
}
