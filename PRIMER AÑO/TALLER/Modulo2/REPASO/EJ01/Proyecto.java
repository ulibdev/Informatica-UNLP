
package Tema5.EJ01;


public class Proyecto {
    private String nombre,nombreDirector;
    private int codigo,dimf = 50,diml=0;
    private Investigador []investigadores = new Investigador[dimf];
    
    public Proyecto(String nombre,int codigo,String nombreDirector){
        setNombre(nombre);
        setCodigo(codigo);
        setNombreDirector(nombreDirector);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void agregarInvestigador(Investigador unInvestigador){
        if(diml < dimf){
        this.investigadores[diml] = unInvestigador;
        diml++;
        }else System.out.println("Estamos llenos");
        
    }
    
    public double getTotalInvestigadoresSubsidios(){
        double aux =0;
        for(int i=0;i <diml;i++){
            aux+=investigadores[i].getTotalMontoSubsidios();
        }
        return aux;
    }
    
    public void otorgarTodos(String nombreCompleto){
        int i=0;
        while((i<diml)&& (!nombreCompleto.equals(investigadores[i].getNombre()))){
            i++;
        }
        if(i != diml){
            investigadores[i].otorgarTodosSubsidios();
        }
    }
    public String toString(){
        String aux= "Nombre:"+this.getNombre()+",codigo:"+this.getCodigo()+",nombre del director:"+this.getNombreDirector()+",dinero otorgado:"+this.getTotalInvestigadoresSubsidios()+"\n"+"INVESTIGADORES:\n";
        for(int i= 0; i<diml;i++){
            aux+=investigadores[i].toString();
            aux+="\n";
        }
        return aux;
    }
    
    
}
