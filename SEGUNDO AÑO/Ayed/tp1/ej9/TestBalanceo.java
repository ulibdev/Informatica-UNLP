package tp1.ej9;

import java.util.Scanner;

public class TestBalanceo {

	public static void main(String[] args) {
		
		Stack<Character> pila1 = new Stack<Character>();
		Stack<Character> pila2 = new Stack<Character>();
		
		Scanner s = new Scanner(System.in);
		
		String aux = s.next();
		
		
		for(int i = 0;i<aux.length()/2;i++) {
			pila1.push(aux.charAt(i));
			pila2.push(aux.charAt(aux.length()-1-i));
		}
		
		boolean sonIguales = true;
		
		while(sonIguales && !pila1.isEmpty() && !pila2.isEmpty()) {
			if(!pila1.pop().equals(pila2.pop())) {
				sonIguales = false;
			}
		}
		
		System.out.println(sonIguales);
		
		
	}

}
