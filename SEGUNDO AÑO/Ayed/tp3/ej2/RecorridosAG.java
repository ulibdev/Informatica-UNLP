package tp3.ej2;

import java.util.LinkedList;
import java.util.List;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class RecorridosAG {

	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,
			Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		if(a != null && !a.isEmpty()) cargarMayoresImpQuePre(a,lista,n);
		return lista;
	}
	
	private void cargarMayoresImpQuePre(GeneralTree <Integer> a,List<Integer> l,Integer n) {
		if(a.getData() > n && a.getData() % 2 == 1)l.add(a.getData());
		if(a.hasChildren()) {
			for(GeneralTree<Integer> hijo : a.getChildren()) {
				cargarMayoresImpQuePre(hijo,l,n);
			}
		}
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden(GeneralTree <Integer> a,
			Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		if(a != null && !a.isEmpty()) cargarMayoresImpQueIn(a,lista,n);
		return lista;
	}

	private void cargarMayoresImpQueIn(GeneralTree <Integer> a,List<Integer> l,Integer n) {
		List<GeneralTree<Integer>> al = a.getChildren();
		if(a.hasChildren()) {
			cargarMayoresImpQueIn(al.get(0),l,n);
		}
		if(a.getData() > n && a.getData() % 2 == 1)l.add(a.getData());
		for(int i = 1; i<al.size();i++)cargarMayoresImpQueIn(al.get(i),l,n);
	}
	
	
	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree <Integer> a,
			Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		if(a != null && !a.isEmpty()) cargarMayoresImpQuePost(a,lista,n);
		return lista;
	}

	private void cargarMayoresImpQuePost(GeneralTree <Integer> a,List<Integer> l,Integer n) {
		if(a.hasChildren()) {
			for(GeneralTree<Integer> hijo : a.getChildren()) {
				cargarMayoresImpQuePost(hijo,l,n);
			}
		}
		if(a.getData() > n && a.getData() % 2 == 1)l.add(a.getData());
	}
	
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,
			Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		if(a!=null && !a.isEmpty()) cargarMayoresImpQueNiveles(a,lista,n);
		return lista;
	}
	
	private void cargarMayoresImpQueNiveles(GeneralTree<Integer> a, List<Integer> lista, Integer n) {
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		cola.enqueue(a);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			GeneralTree<Integer> aux = cola.dequeue();
			if(aux != null && !aux.isEmpty()) {
				if(aux.getData() > n && aux.getData() % 2 == 1) lista.add(aux.getData());
				if(aux.hasChildren()){
					for(GeneralTree<Integer> hijo : aux.getChildren()) {
						cola.enqueue(hijo);
					}
					cola.enqueue(null);
				}
			}
		}
	}
}
