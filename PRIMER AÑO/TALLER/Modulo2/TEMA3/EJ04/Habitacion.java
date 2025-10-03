
package tema3;

import PaqueteLectura.GeneradorAleatorio;


public class Habitacion {
    
    private double costo;
    private Cliente cliente;

    public Habitacion(){
        GeneradorAleatorio.iniciar();
        costo = GeneradorAleatorio.generarDouble(6000)+2000;
        cliente = null;
    }
    
    public boolean getOcupada(){
        return (cliente != null);
    }
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString(){
        String aux;
        if (getOcupada()){
            aux= "Costo:"+costo+",Ocupada por:"+cliente.toString();
        }else {
             aux= "Costo:"+costo+",Desocupada";
        }
        return aux;
    }
    
}
