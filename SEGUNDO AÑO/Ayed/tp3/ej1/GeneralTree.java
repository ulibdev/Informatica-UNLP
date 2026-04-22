package tp3.ej1;

import java.util.LinkedList;
import java.util.List;

import tp1.ej8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {
		int altura = 0;
		if(!this.isEmpty()) {
			Queue<List<GeneralTree<T>>> cola = new Queue<List<GeneralTree<T>>>();
			altura -=1;
			cola.enqueue(this.getChildren());
			cola.enqueue(null);
			while(!cola.isEmpty()) {
				List<GeneralTree<T>> lista = cola.dequeue();
				if(lista != null) {
					for(GeneralTree<T> hijo : lista) {
						if(hijo.hasChildren()) {
							cola.enqueue(hijo.getChildren());
						}
					}
					cola.enqueue(null);
				}
				else altura+=1;
			}
		}return altura;	
	}
	
	public int nivel(T dato) {
		
		if(this != null && !this.isEmpty()) {
			int nivel = 0;
			Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
			cola.enqueue(this);
			cola.enqueue(null);
			while(!cola.isEmpty()) {
			    GeneralTree<T> aux = cola.dequeue();
			    if(aux != null) {
			    	if(aux.getData() == dato)return nivel;
					else {
						if(aux.hasChildren()) {
							for(GeneralTree<T> hijo : aux.getChildren())cola.enqueue(hijo);
						}
					}
				}else nivel+=1;
			}
			return -1;
		}else return -1;
	}
	

	public int ancho(){
		int anc = 0;
		if(this != null && !this.isEmpty()) {
			Queue <GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
			cola.enqueue(this);
			cola.enqueue(null);
			int act= 0;
			while(!cola.isEmpty()) {
				GeneralTree<T> aux = cola.dequeue();
				if(aux != null) {
					act+=1;
					if(aux.hasChildren()) {
						for(GeneralTree<T> hijo : aux.getChildren()) {
							cola.enqueue(hijo);
							
						}
					}
				}else { if(!cola.isEmpty()){
					cola.enqueue(null);
					}
					anc = Math.max(act, anc);
					act = 0;
				}
			}
		}
		return anc;
	}
}