/*
1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)

B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área. 
 */
package tema3;

import PaqueteLectura.Lector;


/**
 *
 * @author ulise
 */
public class Ej01 {


    public static void main(String[] args) {
        //opcion 1;
        int lado1,lado2,lado3;
        String colorRelleno,colorLinea;
        
        System.out.print("Lado 1 :");
        lado1 = Lector.leerInt();
        System.out.println("");
        System.out.print("Lado 2 :");
        lado2 = Lector.leerInt();
        System.out.println("");
        System.out.print("Lado 3 :");
        lado3 = Lector.leerInt();
        System.out.println("");
        System.out.print("color del relleno :");
        colorRelleno = Lector.leerString();
        System.out.println("");
        System.out.print("color de la linea:");
        colorLinea = Lector.leerString();
        System.out.println("");
        
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3,colorRelleno,colorLinea);
        
        
        //opcion 2;
        Triangulo triangulo2 = new Triangulo();
        
        System.out.print("Lado 1 :");
        lado1 = Lector.leerInt();
        triangulo2.setLado1(lado1);
        System.out.println("");
        
        System.out.print("Lado 2 :");
        lado2 = Lector.leerInt();
        triangulo2.setLado2(lado2);
        System.out.println("");
        
        System.out.print("Lado 3 :");
        lado3 = Lector.leerInt();
        triangulo2.setLado3(lado3);
        System.out.println("");
        
        System.out.print("color del relleno :");
        colorRelleno = Lector.leerString();
        triangulo2.setColorRelleno(colorRelleno);
        System.out.println("");
        
        System.out.print("color de la linea:");
        colorLinea = Lector.leerString();
        triangulo2.setColorLinea(colorLinea);
        System.out.println("");
        
        System.out.println("Perimetro triangulo 1:"+ triangulo.calcularPerimetro());
        System.out.println("Area triangulo 1:"+ triangulo.calcularArea());
        System.out.println("Perimetro triangulo 2:"+ triangulo2.calcularPerimetro());
        System.out.println("Area triangulo 2:"+ triangulo2.calcularArea());
    }
    
}
