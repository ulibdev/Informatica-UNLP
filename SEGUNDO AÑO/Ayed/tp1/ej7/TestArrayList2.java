package tp1.ej7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList2 {

	public static void main(String[] args) {
		List<Estudiante> lista = new LinkedList<>();
		
		lista.add(new Estudiante("Jorge","Barsola","Barsola1@lol.com","432","A"));
		lista.add(new Estudiante("Jorged","Barsolo","Barsola2@lol.com","5432","C"));
		lista.add(new Estudiante("Jorget","Barsolu","Barsola3@lol.com","5437","B"));
		
		
		List<Estudiante> listaCopia = new LinkedList<Estudiante>(lista);
		
		for(Estudiante i:lista) {
			System.out.println(i.tusDatos());
		}
		for(Estudiante i:listaCopia) {
			System.out.println(i.tusDatos());
		}
		lista.set(0, new Estudiante ("Fernando","Barsola","Barsola1@lol.com","432","A"));
		listaCopia.set(0, new Estudiante ("Fernanda","Delarua","Barsola1@lol.com","432","A"));
		
		for(Estudiante i:lista) {
			System.out.println(i.tusDatos());
		}
		for(Estudiante i:listaCopia) {
			System.out.println(i.tusDatos());
		}
		for(Estudiante i:lista) {
			System.out.println(i.tusDatos());
		}
		//se hace una copia, no apunta al mismo lugar
		
		
		//forma1 de copia
		List<Estudiante> listaForma1 = new LinkedList<Estudiante>(lista);
		
		//forma 2 de copia
		List<Estudiante> listaForma2 = new LinkedList<>();
		listaForma2.addAll(lista);
		
		
		//forma 3 de copia
		LinkedList<String> peliculas = new LinkedList<String>();
				peliculas.add("Dias Perfectos");
				peliculas.add("Anatomia de una caida");
				peliculas.add("Los que se quedan");
		
		LinkedList<String> peliculas_clonadas = (LinkedList<String>)peliculas.clone();
		//List<Estudiante> listaForma3 = (LinkedList<Estudiante>)lista.clone(); no se puede con List
		
		Estudiante e = new Estudiante ("Gabriela","Barsola","Barsola1@lol.com","432","A");
		
		if(!lista.contains(e)) {
			lista.add(e);
		}
		for(Estudiante i:lista) {
			System.out.println(i.tusDatos());
		}
		
		
		
	}

}
