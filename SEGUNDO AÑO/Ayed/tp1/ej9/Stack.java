package tp1.ej9;

import java.util.ArrayList;
import java.util.List;

import tp1.ej8.Sequence;

public class Stack <T> extends Sequence{

	private List<T> data;
	
	public Stack() {
		data = new ArrayList<T>();
	}
	
	public void push(T dato) {
		data.add(dato);
	}
	public T pop() {
		return data.remove(data.size()-1);
	}
	
	public T top() {
		return data.get(data.size()-1);
	}
	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}
	@Override
	public int size() {
		return data.size();
	}
	
}
