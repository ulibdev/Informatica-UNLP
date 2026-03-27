package tp1.ej7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer>lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		Calculadora.esCapicua(lista);
		System.out.println(Calculadora.esCapicua(lista));
		
		lista.add(4);
		System.out.println(Calculadora.esCapicua(lista));
		
		List<Integer>lista2 = new ArrayList<>();
		Calculadora c = new Calculadora();
		lista2 = c.sucesionRetorna(6);
		
		for(Integer i:lista2) {
			System.out.println(i);
		}
		
		Invertir inv = new Invertir();
		inv.invierte(lista);
		
		for(Integer i:lista) {
			System.out.println(i);
		}
		
		
		ArrayList<Integer> lista6 = new ArrayList<>();
		lista6.add(2);
		
		lista6.add(6);
		
		
		ArrayList<Integer> lista4 = new ArrayList<>();
		lista4.add(1);
		lista4.add(3);
		lista4.add(5);
		
		
		ArrayList<Integer> lista5 = Mezcladora.combinarOrdenado(lista6, lista4);
		
		for(Integer i:lista5) {
			System.out.println("lista 5 :"+ i);
		}
		
		
		LinkedList<Integer> lista3 = new LinkedList<>();
		lista3.add(2);
		
		lista3.add(6);
		int n = c.sumarLinkedList(lista3);
		System.out.println(n);
		
	}

}
