
package Tema5.EJ02;


public class Auto {
    
    private String nombreDuenio,patente;

    public Auto(String nombreDuenio,String patente){
        setNombreDuenio(nombreDuenio);
        setPatente(patente);
    }
    
    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String toString(){
       String aux = "nombre del duenio:"+this.getNombreDuenio()+" ,patente:"+this.getPatente();
       return aux;
    
    }
    
}
