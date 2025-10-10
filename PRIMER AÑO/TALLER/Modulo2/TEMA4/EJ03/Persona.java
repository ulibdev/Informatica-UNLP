
package tema4;


public class Persona {
    private String nombre;
    private int dni,edad;
    
    public Persona(String nombre,int dni,int edad){
        setNombre(nombre);
        setDni(dni);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        String aux = "Mi nombre es "+ this.getNombre() + ",mi dni es "+ this.getDni() + " y tengo " +this.getEdad() + " anios";
        return aux;
    }
    
}
