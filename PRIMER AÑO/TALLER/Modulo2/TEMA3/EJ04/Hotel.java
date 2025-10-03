
package tema3;


public class Hotel {
    private int dimf;
    private Habitacion vector[];
    
    public Hotel(int dimf){
        this.dimf = dimf;
        vector = new Habitacion[dimf];
        int i;
        for (i = 0;i<dimf;i++){
            vector[i] = new Habitacion();
        }
    }
    
    public void ingresarCliente(Cliente cliente,int num){
        vector[num-1].setCliente(cliente);
    }
    
    public void aumentarPrecio(double monto){
        int i;
        for (i=0; i< dimf; i++){
            vector[i].aumentarCosto(monto);
        }
    }
    
    @Override
    public String toString(){
       
        String aux = "HABITACIONES:\n";
       
        for(int i = 0;i<dimf;i++){
           
                aux +="(Habitacion:"+(i+1)+","+vector[i].toString()+")"+"\n";
            
        }
        return aux;
    }
    
}
