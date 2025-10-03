
package tema3;


public class Autor {
    
    private String nombre,biografia,origen;
    
    public Autor(){
        nombre="Sin nombre";
        biografia="Sin biografia";
        origen="Sin origen";
    }
    public Autor(String nombre){
        this.nombre = nombre;
        this.biografia = "Sin biografia";
        this.origen = "Sin origen";
        
    }
    public Autor(String nombre, String biografia){
        this.nombre = nombre;
        this.biografia = biografia;
        origen = "Sin origen";
        
    }
    public Autor(String nombre, String biografia,String origen){
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = biografia;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    @Override
    public String toString(){
        String aux = "(nombre:"+nombre + ",biografia:"+biografia+",origen:"+origen+")";
        return aux;
    }
    
}
