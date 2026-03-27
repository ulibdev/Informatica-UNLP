package tp1.ej1;

public class Impresora {

	static void imprimirFor(int a,int b) {
		for (int i = a;i<=b;i++) System.out.println(i);
	}
	
	static void imprimirWhile(int a,int b) {
		while(a <=b) {
			System.out.println(a);
			a++;
		}
	}
	static void imprimirRecursivo(int a, int b) {
		if(a<=b) {
			System.out.println(a);
			imprimirRecursivo(a+1, b);
		}
		
	}
}
