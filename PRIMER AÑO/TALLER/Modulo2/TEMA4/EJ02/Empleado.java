
package tema4;


public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    public Empleado(String nombre,double sueldo,int antiguedad){
        setNombre(nombre);
        setSueldo(sueldo);
        setAntiguedad(antiguedad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public abstract int calcularEfectividad();
    
    public double calcularSueldoACobrar(){
        double aux = 0.10*this.getAntiguedad();
        aux = aux * this.getSueldo();
        aux += this.getSueldo();
        return aux;
    }
    
    public String toString(){
        String aux = "(NOMBRE:"+this.getNombre()+",SUELDO:"+this.calcularSueldoACobrar()+",EFECTIVIDAD:"+this.calcularEfectividad();
        return aux;
    }
    
}
