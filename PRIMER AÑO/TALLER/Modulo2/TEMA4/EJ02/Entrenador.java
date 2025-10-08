
package tema4;


public class Entrenador extends Empleado{
    private int campeonatoGanado;
    public Entrenador(String nombre,double sueldo,int antiguedad,int campeonatoGanado){
        super(nombre, sueldo,antiguedad);
        setCampeonatoGanado(campeonatoGanado);
    }

    public int getCampeonatoGanado() {
        return campeonatoGanado;
    }

    public void setCampeonatoGanado(int campeonatoGanado) {
        this.campeonatoGanado = campeonatoGanado;
    }
    
    public int calcularEfectividad(){
        return (this.getCampeonatoGanado()/this.getAntiguedad());
    }
    
    public double calcularSueldoACobrar(){
        double aux = super.calcularSueldoACobrar();
        double campeonato = this.getCampeonatoGanado();
        if((campeonato >= 1) && (campeonato <=4)) aux+=5000;
        else if ((campeonato >= 5) && (campeonato <=10))aux+=30000;
        else if ((campeonato > 10))aux+=50000;
        return aux;
    }
    
}
