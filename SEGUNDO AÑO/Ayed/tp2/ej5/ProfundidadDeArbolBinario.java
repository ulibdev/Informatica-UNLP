package tp2.ej5;

import tp1.ej8.Queue;
import tp2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {

	private BinaryTree<Integer> arbol;
	
	public ProfundidadDeArbolBinario( BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int sumaElementosProfundidad (int p){
		int suma = 0;
		Queue<BinaryTree<Integer>>cola = new Queue<BinaryTree<Integer>>();
		int lvl = 0;
		cola.enqueue(arbol);
		while(!cola.isEmpty()) {
			int cantProcesar = cola.size();
			BinaryTree<Integer> arbol2;
			for(int i = 0; i<cantProcesar;i++) {
				arbol2 = cola.dequeue();
				if(lvl == p) {
					suma+=arbol2.getData();
				}else if(lvl<p) {
					if(arbol2.hasLeftChild())cola.enqueue(arbol2.getLeftChild());
					if(arbol2.hasRightChild())cola.enqueue(arbol2.getRightChild());
				}
			}
			lvl+=1;
		}
		return suma;
		
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(31);
		arbol.addLeftChild(new BinaryTree<Integer>(30));
		arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(29));
		arbol.addRightChild(new BinaryTree<Integer>(34));
		ProfundidadDeArbolBinario a = new ProfundidadDeArbolBinario(arbol);
		System.out.println(a.sumaElementosProfundidad(2));

	}

}
