package tp2.ej4;

import tp2.ejercicio1.BinaryTree;

public class RedBinariaLlena {

	 private BinaryTree<Integer> red;
	    public RedBinariaLlena(BinaryTree<Integer> unArbolLleno) {
	        this.red = unArbolLleno;
	    }
	    
	public int retardoReenvio() {
		if(red.isEmpty()) {
			return 0;
		}else return calcularMax(red);
	}
	
	private int calcularMax(BinaryTree<Integer> arbol) {
		int cantIzq = 0; int cantDer = 0;
		if(arbol.hasLeftChild()) {
			cantIzq = calcularMax(arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			cantDer = calcularMax(arbol.getRightChild());
		}	
		if(arbol.isEmpty()) {
			return Math.max(cantIzq, cantDer);
		}else return Math.max(cantIzq, cantDer) + arbol.getData();
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(31);
		arbol.addLeftChild(new BinaryTree<Integer>(30));
		arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(29));
		arbol.addRightChild(new BinaryTree<Integer>(null));
		RedBinariaLlena a = new RedBinariaLlena(arbol);
		
		System.out.println(a.retardoReenvio());
		
		
		
	}

}
