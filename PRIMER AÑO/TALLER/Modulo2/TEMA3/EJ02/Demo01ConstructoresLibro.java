/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/*B- Modifique el programa Demo01Constructores (carpeta tema3) para instanciar los
libros con su autor, considerando las modificaciones realizadas. Luego, a partir de uno de
los libros instanciados, obtenga e imprima la representación del autor de ese libro.
 */
public class Demo01ConstructoresLibro {

    
    public static void main(String[] args) {
        Autor autor1 = new Autor("Herbert Schildt");
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 autor1, "978-0071809252", 21.72);
        Autor autor2 = new Autor("John Horton");
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               autor2, "978-1512108347");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        System.out.println("Autor libro 1:"+libro1.getPrimerAutor().toString());
        System.out.println("Autor libro 2:"+libro2.getPrimerAutor().toString());
        Libro libro3= new Libro(); 
    }
    
}
