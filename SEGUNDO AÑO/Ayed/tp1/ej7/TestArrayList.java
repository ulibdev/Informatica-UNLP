package tp1.ej7;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		//a
		Scanner s1 = new Scanner(System.in);
		List <Integer> numeros1 = new ArrayList<>();
		int n1;
		for(int i = 1; i<=10;i++) {
			n1= s1.nextInt();
			numeros1.add(n1);
			
		}
		
		for (Integer i:numeros1) {
			System.out.print(i);
		}
	
		
		//b
		Scanner s2 = new Scanner(System.in);
		List <Integer> numeros2 = new LinkedList<>();
		
		int n2;
		for(int i = 1; i<=10;i++) {
			n2= s2.nextInt();
			numeros2.add(n2);
			
		}
		
		for (Integer i:numeros2) {
			System.out.print(i);
		}
		
		//c
		Iterator<Integer> it1 = numeros1.iterator();
		Iterator it2 = numeros2.iterator(); // problema casteo
		
		while(it1.hasNext()) {
			System.out.println((it1.next().intValue()));
		}
		while(it2.hasNext()) {
			System.out.println(((Integer)it2.next()).intValue());
		}
	}

}
