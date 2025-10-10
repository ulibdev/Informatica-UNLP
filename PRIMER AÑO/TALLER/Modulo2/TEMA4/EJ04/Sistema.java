
package tema4.EJ04;



public abstract class Sistema {
    private Estacion estacion;
    private int cantAnios,anioInicial;
    private double [][]datos;
    
    public Sistema(Estacion estacion,int cantAnios,int anioInicial){
        this.estacion = estacion;
        this.cantAnios = cantAnios;
        this.anioInicial = anioInicial;
        datos = new double[cantAnios][12];
        for (int i = 0;i<cantAnios;i++){
            for (int j = 0 ;j<12;j++){
                datos[i][j] = 999.99;
            }
        }
    }
    
    public double getTemperatura(int mes, int anio){
        return datos[anio-anioInicial][mes];
    }
    public void setTemperatura(double temp,int mes, int anio){
        datos[anio-anioInicial][mes] =temp;
    }
    
    public String mayorTempertura(){
        int maxMes=-1,maxAnio=-1;
        double maxTemp = -1;
        for (int i = 0; i <cantAnios ; i++){
            for (int j=0; j<12;j++){
                if(maxTemp < this.getTemperatura(j, i+ anioInicial)) {
                    maxTemp = this.getTemperatura(j, i +anioInicial);
                    maxAnio = i;
                    maxMes = j;
                }
            }
        }
        String aux = "Mes:"+(maxMes+1) +",Anio:"+(maxAnio+anioInicial);
        return aux;
    }
    
    public abstract String getPromedio();

    public Estacion getEstacion() {
        return estacion;
    }
    
    public int getCantAnios() {
        return cantAnios;
    }

    public int getAnioInicial() {
        return anioInicial;
    }
    
    public String toString(){
        String aux = estacion.toString() + ":\n"+ this.getPromedio();
        return aux;
    }
    
}
