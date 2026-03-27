package tp1.ej7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Calculadora {

	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		boolean aux;
		if(!lista.isEmpty()) {
		aux = true;
		int i1 = 0,i2 = lista.size()-1;
		while(lista.size()/2 > i1 && aux) {
			if(lista.get(i1) != lista.get(i2)) aux = false;
			else {
				i1++;
				i2--;	
			}
		}}
		else aux = false;
		return aux;
	}
	
	
	
	public List<Integer> sucesionRetorna(int n){
		List<Integer> lista = new ArrayList<>();
		sucesion(n,lista);
		return lista;
		
	}
	
	private void sucesion(int n, List<Integer> lista){
		lista.add(n);
		if(n!=1) {
		if( n% 2 == 0 ) {
			sucesion(n/2,lista);
		}else {
			sucesion((3*n)+1,lista);
		}
		}
	}
	
	public int sumarLinkedList(LinkedList<Integer> lista) {
		Integer acu = 0;
		acu = sumaTodo(lista,0);
		return acu;
	}
	
	private int sumaTodo(LinkedList<Integer> lista,int pos) {
		if(pos<lista.size()) {
			return sumaTodo(lista,pos+1)+lista.get(pos).intValue();	
		}return 0;  
	}
	
}
