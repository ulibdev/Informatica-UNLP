package tp1.ej7;

import java.util.ArrayList;

public class Invertir {
	
	public void invierte(ArrayList<Integer>lista) {
		invertidor(lista,0,lista.size()-1);
	}
	
	private void invertidor(ArrayList<Integer>lista,int pos1,int pos2) {
		
		if(pos1<pos2) {
		int aux = lista.get(pos1);
		lista.set(pos1, lista.get(pos2));
		lista.set(pos2, aux);
		
			invertidor(lista,pos1+1,pos2-1);
		}
		
	}
	
	
	
	
}
