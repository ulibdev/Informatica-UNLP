/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author ulise
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo(){
        lado1=0;
        lado2=0;
        lado3=0;
        colorRelleno = "Sin relleno";
        colorLinea = "Sin color";
    }
    
    
    public Triangulo(int lado1, int lado2, int lado3,String colorRelleno,String colorLinea){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    public double calcularPerimetro(){
        return lado1 +lado2 + lado3;
    }
    
    public double calcularArea(){
        double s = (lado1+lado2+lado3)/2;
        double res = s*(s-lado1)*(s-lado2)*(s-lado3);
        res= Math.sqrt(res);
        return res;
    }
    
    
}
