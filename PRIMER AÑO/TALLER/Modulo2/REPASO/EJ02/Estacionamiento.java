
package Tema5.EJ02;

public class Estacionamiento {//<>
    
    private String nombre,direccion,horaAper,horaCierre;
    private int numeroPisos,numeroPlazas;
    private Auto [][]matriz;
    
    public Estacionamiento(String nombre,String direccion){
        setNombre(nombre);
        setDireccion(direccion);
        setHoraAper("8:00");
        setHoraCierre("21:00");
        setNumero(5, 10);
        matriz = new Auto[5][10];
        for(int i = 0; i<5;i++){
            for(int j = 0; j<10;j++){
                matriz[i][j] = null;
            }
        }
    }
    
    public Estacionamiento(String nombre,String direccion,String horaAper,String horaCierre,int numeroPisos,int numeroPlazas){
        setNombre(nombre);
        setDireccion(direccion);
        setHoraAper(horaAper);
        setHoraCierre(horaCierre);
        setNumero(numeroPisos, numeroPlazas);
        matriz = new Auto[numeroPisos][numeroPlazas];
        for(int i = 0; i<numeroPisos;i++){
            for(int j = 0; j<numeroPisos;j++){
                matriz[i][j] = null;
            }
        }
    }

    private void setNumero(int numeroPisos,int numeroPlazas){
        this.numeroPisos = numeroPisos;
        this.numeroPlazas = numeroPlazas;
    }
    
    private int getNumeroPisos() {
        return numeroPisos;
    }

    private int getNumeroPlazas() {
        return numeroPlazas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHoraAper() {
        return horaAper;
    }

    public void setHoraAper(String horaAper) {
        this.horaAper = horaAper;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }
    
    public void registrarAuto(Auto auto, int x,int y){
        matriz[x-1][y-1] = auto;
    }
    
    public String buscarAutoPatente(String patente){
        int i=0,j=0;
        boolean encontrado = false;
        while((i<this.getNumeroPisos()) && (!encontrado)){
            j=0;
            while(j<this.getNumeroPlazas() && (!encontrado)){
                
                if((matriz[i][j] != null) && (patente.equals(matriz[i][j].getPatente()))){ 
                    encontrado = true;
                }else j++;
            }
           if(!encontrado)i++;
        }
        String aux;
        if(encontrado){
            aux = "Esta en el piso "+ (i+1) + " y en la plaza "+(j+1);
        }else aux = "Auto inexistente";
        return aux;
          
    }
    
    
    public String toString(){
        String aux = "";
        
        for(int i=0;i<this.getNumeroPisos();i++){
            for(int j=0;j<this.getNumeroPlazas();j++){
                aux +="Piso "+(i+1)+",Plaza "+(j+1);
                if(matriz[i][j] == null) aux+= " Libre\n";
                else aux+= matriz[i][j].toString() + "\n";
            }
        }
        return aux;
    }
    
    public int retornarCantAutos(int y){
        int cant=0;
        for (int i = 0; i<this.getNumeroPisos();i++){
            if(matriz[i][y-1] != null)cant++;
        }
        return cant;
    }

    
    
    
}
