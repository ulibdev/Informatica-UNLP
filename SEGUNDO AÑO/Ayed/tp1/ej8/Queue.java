package tp1.ej8;

import java.util.*;

public class Queue<T> extends Sequence{
	
	protected List<T> lista;
	
	public Queue() {
		lista = new LinkedList<T>();
	}
	
	public void enqueue(T dato) {
		lista.add(dato);
	}

	
	public T dequeue(){
		return lista.remove(0);
	}
	public T head(){
		return lista.get(0);
	}
	
	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	@Override
	public int size() {
		return lista.size();
	}
	
	@Override
	public String toString() {
		String aux = "";
		for(T i:lista) {
			aux+= i + ",";
		}
		return aux;
	}
	
}
