

package tema4;


public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio,String colorRelleno,String colorLinea){
        super(colorRelleno,colorLinea);
        setRadio(radio);
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        double r = getRadio() * getRadio();
        r = r * 3.14;
        return r;
    }
    
    public double calcularPerimetro(){
        double res = 2*3.14*getRadio();
        return res;
    }
    public String toString(){
        String aux = super.toString() + " Radio:"+ getRadio();
        return aux;
    }
    
}
