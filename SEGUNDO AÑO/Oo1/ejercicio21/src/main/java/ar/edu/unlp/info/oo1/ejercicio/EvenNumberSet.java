package ar.edu.unlp.info.oo1.ejercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EvenNumberSet implements Set<Integer> {

	private List<Integer> lista;
	
	public EvenNumberSet() {
		this.lista = new ArrayList<Integer>();
	}
	
	@Override
	public int size() {
		return this.lista.size();
	}

	@Override
	public boolean isEmpty() {
		return this.lista.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.lista.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.lista.iterator(); // ????
	}

	@Override
	public Object[] toArray() {
		return this.lista.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.lista.toArray(a);
	}

	@Override
	public boolean add(Integer e) {
		if(e % 2 == 0) {
			this.lista.add(e);
			return true;
		}else return false;
	}

	@Override
	public boolean remove(Object o) {
		return this.lista.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.lista.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		if(c.stream().filter(i -> i % 2 == 1).count() == 0) return this.lista.addAll(c);
		else return false;
		
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.lista.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.lista.removeAll(c);
	}

	@Override
	public void clear() {
		this.lista.clear();
	}

}
