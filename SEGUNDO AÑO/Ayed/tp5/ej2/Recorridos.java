package tp5.ej2;

import java.util.ArrayList;
import java.util.List;

import tp1.ej8.Queue;
import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class Recorridos<T> {

	
	public List<T> dfs(Graph<T> grafo){
		ArrayList<T> lista = new ArrayList<T>();
		if(grafo != null && !grafo.isEmpty())dfs(grafo,lista);
		return lista;
	}
	private void dfs(Graph<T> grafo, List<T> lista) {
		boolean[] marca = new boolean[grafo.getSize()];
		for(int i = 0; i<grafo.getSize();i++) {
			if(!marca[i]) {
				dfs(marca,i,grafo,lista);
			}
		}
	}
	private void dfs(boolean[] marca,int i, Graph<T> grafo, List<T> lista) {
		marca[i] = true;
		Vertex<T> v = grafo.getVertex(i);
		lista.add(v.getData());
		for(Edge<T> e : grafo.getEdges(v)) {
			int j = e.getTarget().getPosition();
			if(!marca[j])dfs(marca,j,grafo,lista);
		}
	}
	
	
	public List<T> bfs(Graph<T> grafo){
		ArrayList<T> lista = new ArrayList<T>();
		if(grafo != null && !grafo.isEmpty())bfs(grafo,lista);
		return lista;
	}
	
	private void bfs(Graph<T> grafo,List<T> lista) {
		boolean[] marca = new boolean[grafo.getSize()];
		for(int i = 0; i<grafo.getSize();i++) {
			if(!marca[i]) {
				bfs(i,grafo,marca,lista);
			}
		}
	}
	private void bfs(int i,Graph<T> grafo,boolean[] marca,List<T> lista) {
		marca[i]=true;
		Queue<Vertex<T>> cola = new Queue<Vertex<T>>();
		cola.enqueue(grafo.getVertex(i));
		Vertex<T> v;
		while(!cola.isEmpty()) {
			v = cola.dequeue();
			lista.add(v.getData());
			for(Edge<T> e : grafo.getEdges(v)) {
				int j = e.getTarget().getPosition();
				if(!marca[j]) {
					marca[j] = true;
					cola.enqueue(e.getTarget());
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		Graph<Integer> grafo = new AdjListGraph<Integer>();
		
		for(int i = 1; i<9;i++) {
			grafo.createVertex(i);
		}
		grafo.connect(grafo.search(1), grafo.search(5)); 
		grafo.connect(grafo.search(5), grafo.search(6));
		grafo.connect(grafo.search(6), grafo.search(8));
		grafo.connect(grafo.search(8), grafo.search(7));
		
		grafo.connect(grafo.search(2), grafo.search(7));
		grafo.connect(grafo.search(2), grafo.search(3));
		grafo.connect(grafo.search(2), grafo.search(1));
		
		grafo.connect(grafo.search(4), grafo.search(1));
		grafo.connect(grafo.search(4), grafo.search(6));
		grafo.connect(grafo.search(4), grafo.search(3));
		
		grafo.connect(grafo.search(3), grafo.search(7));
		System.out.println("POR PROFUNDIDAD");
		for(int i : new Recorridos<Integer>().dfs(grafo)) {
			System.out.println(i);
		}
		System.out.println("POR AMPLITUD");
		for(int i : new Recorridos<Integer>().bfs(grafo)) {
			System.out.println(i);
		}
		

	}

}
