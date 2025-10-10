
package tema4.EJ04;


public class SistemaAnual extends Sistema{
    
    public SistemaAnual(Estacion estacion,int cantAnios,int anioInicial){
        super(estacion,cantAnios,anioInicial);
    }
    
    public String getPromedio(){
        String aux = "";
        double total;
        for (int i= 0; i <this.getCantAnios();i++){
            total = 0;
            for(int j = 0;j<12;j++){
                total +=this.getTemperatura(j, i + this.getAnioInicial());
            }
            aux+= "Anio:"+ (i+this.getAnioInicial()) +",temperatura:"+ total/12+"°C \n";
        }
        return aux;
    }
    public String toString(){
        return super.toString();
    }
}
