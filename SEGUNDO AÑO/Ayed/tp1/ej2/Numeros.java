package tp1.ej2;

import java.util.Scanner;

public class Numeros {

	public int[] multiplos() {
		Scanner s = new Scanner(System.in);
		int tam = s.nextInt();
		int[]vec = new int[tam];
		for(int i = 1; i<=tam;i++) {
			vec [i-1] = i * tam;
		}
		return vec;
	}
}
