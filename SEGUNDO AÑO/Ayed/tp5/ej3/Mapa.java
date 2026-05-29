package tp5.ej3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.listaAdy.AdjListGraph;

public class Mapa {
	
	private Graph<String> mapaCiudades;
	
	public Mapa(Graph<String> mapaCiudades) {
		this.mapaCiudades = mapaCiudades;
	}
	
	public List<String> devolverCamino(String ciudad1, String ciudad2){
		List<String> camino = new ArrayList<String>();
		if(mapaCiudades != null && !mapaCiudades.isEmpty()) {
			Vertex<String> v1 = mapaCiudades.search(ciudad1);
			boolean[] marca = new boolean[mapaCiudades.getSize()];
			devolverCaminoHelper(camino,v1.getPosition(),marca,ciudad2);
		}
		return camino;
	}
	
	private boolean devolverCaminoHelper(List<String> camino,int i,boolean[] marca, String ciudad2) {
		marca[i] = true;
		Vertex<String> act = mapaCiudades.getVertex(i);
		Iterator<Edge<String>> adyacentes = mapaCiudades.getEdges(act).iterator();
		boolean terminado = act.getData().equals(ciudad2);
		camino.add(act.getData());
		Edge<String> adyacente;
		while(!terminado && adyacentes.hasNext()) {
			adyacente = adyacentes.next();
			int j = adyacente.getTarget().getPosition();
			if(!marca[j]) {
				terminado = devolverCaminoHelper(camino,j,marca,ciudad2);
			}
		}
		if(!terminado) {camino.remove(camino.size()-1);}
		return terminado;
	}
	
	
	
	public List<String> devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades){
		List<String> camino = new ArrayList<String>();
		if(mapaCiudades != null && !mapaCiudades.isEmpty()) devolverCaminoExceptuandoHelper(camino,ciudad1,ciudad2,ciudades);
		return camino;
	}
	private void devolverCaminoExceptuandoHelper(List<String> camino,String ciudad1, String ciudad2,List<String> ciudades) {
		Vertex<String> v1 = mapaCiudades.search(ciudad1);
		boolean[] marca = new boolean[mapaCiudades.getSize()];
		for(String i: ciudades) {
			marca[mapaCiudades.search(i).getPosition()] = true;
		}
		devolverCaminoHelper(camino,v1.getPosition(),marca,ciudad2);
	}
	
	public List<String> caminoMasCorto(String ciudad1, String ciudad2){
		List<String> min = new ArrayList<String>();
		if(mapaCiudades != null && !mapaCiudades.isEmpty()) {
			List<String> act = new ArrayList<String>();
			boolean[] marca = new boolean[mapaCiudades.getSize()];
			Vertex<String> v1 = mapaCiudades.search(ciudad1);
			caminoMasCortoHelper(min,act,marca,v1.getPosition(),ciudad2);
		}
		return min;
	}
	private void caminoMasCortoHelper(List<String> min,List<String> act, boolean[] marca ,int i,String ciudad2) {
		marca[i]=true;
		Vertex<String> v = mapaCiudades.getVertex(i);
		act.add(v.getData());
		if(v.getData().equals(ciudad2) && (min.size() == 0 || min.size() > act.size())) {
			min.clear();
			min.addAll(act);
		}
		Iterator<Edge<String>> adyacentes = mapaCiudades.getEdges(v).iterator();
		Edge<String> adyacente;
		while(adyacentes.hasNext()) {
			adyacente = adyacentes.next();
			int j = adyacente.getTarget().getPosition();
			if(!marca[j]) {
				caminoMasCortoHelper(min, act, marca, j,ciudad2);
				marca[j]=false;
			}
		}
		act.remove(act.size()-1);
	}
	
	
	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto){
		List<String> camino = new ArrayList<String>();
		if(mapaCiudades != null && !mapaCiudades.isEmpty()) {
			boolean[] marca = new boolean[mapaCiudades.getSize()];
			caminoSinCargarCombustibleHelper(mapaCiudades.search(ciudad1).getPosition(),marca,ciudad2,tanqueAuto,camino);
		}
		return camino;
	}
	
	private boolean caminoSinCargarCombustibleHelper(int i, boolean[] marca,String ciudad2, int tanqueAuto,List<String> camino) {
		marca[i] = true;
		Vertex<String> act = mapaCiudades.getVertex(i);
		boolean encontrado = false;
		camino.add(act.getData());
		if(act.getData().equals(ciudad2)) {
			encontrado = true;
		}else {
			Iterator<Edge<String>> adyacentes = mapaCiudades.getEdges(act).iterator();
			Edge<String> adyacente;
			while(!encontrado && adyacentes.hasNext()) {
				adyacente = adyacentes.next();
				int j = adyacente.getTarget().getPosition();
				int tanque = tanqueAuto - adyacente.getWeight();
				if(!marca[j] && tanque>=0) {
					encontrado = caminoSinCargarCombustibleHelper(j, marca, ciudad2, tanque, camino);
				}
			}
			if(!encontrado)camino.remove(camino.size()-1);
		}
		return encontrado;
	}
	
	public List<String> caminoConMenorCargaDeCombustible(String ciudad1, String ciudad2,int tanqueAuto){
		List<String> min = new ArrayList<String>();
		if(mapaCiudades != null && !mapaCiudades.isEmpty()) {
			List<String> act = new ArrayList<String>();
			Vertex<String> v = mapaCiudades.search(ciudad1);
			boolean[] marca = new boolean[mapaCiudades.getSize()];
			caminoConMenorCargaDeCombustibleHelper(min,act,marca,v.getPosition(),tanqueAuto,tanqueAuto,0,Integer.MAX_VALUE,ciudad2);
		}
		return min;
	}
	private int caminoConMenorCargaDeCombustibleHelper(List<String> min, List<String> act, boolean[] marca, int i, int tanqueAutoMax,int tanqueAutoAct,int actCom,int max,String ciudad2) {
		marca[i] = true;
		Vertex<String> v = mapaCiudades.getVertex(i);
		act.add(v.getData());
		if(v.getData().equals(ciudad2) && max > actCom) {
				min.clear();
				min.addAll(act);
				max = actCom;
		}else {
			for(Edge<String> e : mapaCiudades.getEdges(v)) {
				int j = e.getTarget().getPosition();
				int tanque = tanqueAutoAct - e.getWeight();
				if((tanque < 0) && tanqueAutoMax - e.getWeight() >=0) {
					max = caminoConMenorCargaDeCombustibleHelper(min, act, marca, j, tanqueAutoMax,tanqueAutoMax, actCom+1, max, ciudad2);
					marca[j] = false;
				}else if(tanque >= 0) {
					max = caminoConMenorCargaDeCombustibleHelper(min, act, marca, j, tanqueAutoMax,tanque, actCom, max, ciudad2);
					marca[j] = false;
				}
			}
		}
		act.remove(act.size()-1);
		return max;
	}
		
	
	

	public static void main(String[] args) {
		
		
		Graph<String> grafo = new AdjListGraph<String>();
		
		grafo.createVertex("1");
		grafo.createVertex("2");
		grafo.createVertex("3");
		grafo.createVertex("4");
		grafo.createVertex("5");
		grafo.createVertex("6");
		grafo.createVertex("7");
		grafo.createVertex("8");
	
		grafo.connect(grafo.search("1"), grafo.search("5"),10); 
		grafo.connect(grafo.search("5"), grafo.search("6"),15);
		grafo.connect(grafo.search("6"), grafo.search("8"),5);
		grafo.connect(grafo.search("8"), grafo.search("7"),10);
		
		grafo.connect(grafo.search("2"), grafo.search("7"),30);
		grafo.connect(grafo.search("2"), grafo.search("3"),5);
		grafo.connect(grafo.search("2"), grafo.search("1"),60);
		
		grafo.connect(grafo.search("4"), grafo.search("1"),20);
		grafo.connect(grafo.search("4"), grafo.search("6"),10);
		grafo.connect(grafo.search("4"), grafo.search("3"),5);
		
		grafo.connect(grafo.search("3"), grafo.search("7"),10);
		
		
		
		for(String i : new Mapa(grafo).caminoMasCorto("2","7") ){
			System.out.println(i);
		}
		
		
		

	}

}
