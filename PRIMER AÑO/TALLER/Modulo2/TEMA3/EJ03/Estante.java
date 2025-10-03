/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;


public class Estante {
    private int dimf = 20;
    private Libro []vector = new Libro[dimf];
    private int diml;
    
    public Estante(){
        diml = 0;
    }
    
    public int getCantLibros(){
        return diml;
    }
    
    public boolean getLleno(){
        return (diml == dimf);
    }
    
    public void agregarLibro(Libro libro){
        if(diml< dimf){
            vector[diml] = libro;
            diml++;
        } else System.out.println("Estante lleno");
    }
    //se supone que si o si existe
    public Libro getLibro(String titulo){
        int i = 0;
        while((i<= diml) && (!vector[i].getTitulo().equals(titulo))){
            i++;
        }
        return vector[i];
    }
}
