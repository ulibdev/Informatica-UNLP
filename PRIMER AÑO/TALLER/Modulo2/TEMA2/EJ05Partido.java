/*
 5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto
partido sabe responder a los siguientes mensajes:

Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:

- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.<>
 */
package tema2;

import PaqueteLectura.Lector;
public class EJ05Partido {
    
    public static void main(String[] args){
        Partido []p = new Partido[20];
        String nombreLocal,nombreVisitante;
        int golLocal,golVisitante,diml=-1;
        
        //leerPartidos
        System.out.println("Nombre Visitante:");
        nombreVisitante = Lector.leerString();
        while((diml<19) &&(!nombreVisitante.equals("ZZZ"))){
            diml++;
            System.out.println("Cantidad de goles Visitante:");
            golVisitante = Lector.leerInt();
            System.out.println("Nombre Local");
            nombreLocal = Lector.leerString();
            System.out.println("Cantidad de goles Local:");
            golLocal = Lector.leerInt();
            p[diml] = new Partido(nombreLocal,nombreVisitante,golLocal,golVisitante);
            System.out.println("Nombre Visitante:");
            nombreVisitante = Lector.leerString();
        }
        int cantRiver=0,cantGolesBoca=0,i;
        for(i=0;i<=diml;i++){
            System.out.println(p[i].getLocal()+" "+p[i].getGolesLocal() +" VS "+p[i].getVisitante()+" "+p[i].getGolesVisitante());
            
            if((p[i].hayGanador()) && (p[i].getGanador().equals("River"))) cantRiver++;
            if(p[i].getLocal().equals("Boca")){
                cantGolesBoca+=p[i].getGolesLocal();
                        }
        } 
        System.out.println("Partidos Ganados River:"+cantRiver);
        System.out.println("Goles hechos por Boca de Local:"+cantGolesBoca);
          
    }
    
}
