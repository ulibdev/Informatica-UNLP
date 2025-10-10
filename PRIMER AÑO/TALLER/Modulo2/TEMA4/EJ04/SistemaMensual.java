
package tema4.EJ04;


public class SistemaMensual extends Sistema{
    
    private String[] meses = new String[]{"Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};
    
    public SistemaMensual(Estacion estacion,int cantAnios,int anioInicial){
        super(estacion,cantAnios,anioInicial);
    }
    
    public String getPromedio(){
        String aux = "";
        double total;
        for(int j = 0;j<12;j++){
            total = 0;
            aux += meses[j] + ":";
            for (int i= 0; i <this.getCantAnios();i++){
                total +=this.getTemperatura(j, i + this.getAnioInicial());
            }
            aux += (total/this.getCantAnios())+"°C \n";
        }
        return aux;
    
    }
    
    public String toString(){
        return super.toString();
    }
}
