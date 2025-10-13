
package Tema5.EJ01;


public class Investigador {
    private String nombre,especialidad;
    private int categoria,dimf = 5,diml=0;
    private Subsidio []subsidios = new Subsidio[dimf];
    
    public Investigador(String nombre,int categoria, String especialidad){
        setNombre(nombre);
        setCategoria(categoria);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public void agregarSubsidio(Subsidio unSubsidio){
        this.subsidios[diml] = unSubsidio;
        diml++;
    }
    
    public double getTotalMontoSubsidios(){
        double aux = 0;
        for(int i=0;i<diml;i++){
            if(subsidios[i].getOtorgado())aux+= subsidios[i].getMontoPedido();
        }
        
        return aux;
    }
    
    public void otorgarTodosSubsidios(){
        for(int i=0;i<diml;i++){
            subsidios[i].setOtorgado(true);
        }
    }
    
    public String toString(){
        String aux = "Nombre:"+this.getNombre()+",categoria:"+this.getCategoria()+",especialidad"+this.getEspecialidad()+",total subsidios:"+this.getTotalMontoSubsidios();
        return aux;
    }
}
