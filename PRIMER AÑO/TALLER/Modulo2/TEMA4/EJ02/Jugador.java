
package tema4;


public class Jugador extends Empleado {
    private int partidosGanados,goles;
    
    public Jugador(String nombre,double sueldo,int antiguedad,int partidosGanados, int goles){
        super(nombre,sueldo,antiguedad);
        setPartidosGanados(partidosGanados);
        setGoles(goles);
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    public int calcularEfectividad(){
        return (this.getGoles()/this.getPartidosGanados());
    }
    
    public double calcularSueldoACobrar(){
        double aux = super.calcularSueldoACobrar();
        double promedio = this.calcularEfectividad();
        if(promedio > 0.5) aux +=this.getSueldo();
        return aux;
    }
    
}
