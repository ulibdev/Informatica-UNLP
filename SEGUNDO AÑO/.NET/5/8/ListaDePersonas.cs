using System;

namespace teoria5;
/*
Completarla y agregar dos indizadores de sólo lectura
Un índice entero que permite acceder a las personas de la lista por número de documento. Por ejemplo
p=lista[30456345] devuelve el objeto Persona que tiene DNI=30456345 o null en caso que no
exista en la lista.
Un índice de tipo char que devuelve un List<string> con todos los nombres de las personas de la
lista que comienzan con el carácter pasado como índice.
*/
class ListaDePersonas{

    private List<Persona> _lista = new List<Persona>();
    public void Agregar(Persona p){
        _lista.Add(p);
    }

    public Persona this[int i]
    {
        get 
        {
            foreach (Persona p in _lista)
            {
             if(p.Dni == i) return p;   
            } 
            return null;
        }
    }

    public List<string> this[char i]
    {
        get 
        {
            List<string> aux = new List<string>(); 
            foreach (Persona p in _lista)
            {
                if(p.Nombre[0] == i)aux.Add(p.Nombre);    
            } 
            return aux;
        }
    }



}
