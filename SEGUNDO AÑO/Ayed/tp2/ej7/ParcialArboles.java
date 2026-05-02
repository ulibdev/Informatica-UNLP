package tp2.ej7;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {

	private BinaryTree<Integer> arbol;
	
	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public boolean isLeftTree (int num) {
		BinaryTree<Integer> arbolNuevo = buscarNodo(this.arbol,num);
		if(arbolNuevo == null) {
			return false;
		}
		else 
		{
			int cantizq = 0;
			if(arbolNuevo.hasLeftChild()) {
				cantizq = calcularSolos(arbolNuevo.getLeftChild());
			}
			int cantder = 0;
			if(arbolNuevo.hasRightChild()) {
				cantder = calcularSolos(arbolNuevo.getRightChild());
			}
			if(cantizq > cantder) return true;
			else return false;
		}
	}
	
	private BinaryTree<Integer> buscarNodo (BinaryTree<Integer> arbol,int num){
		if(!arbol.isEmpty() && arbol != null) {
			if(arbol.getData() == num) return arbol;
			else {
				if(arbol.hasLeftChild()) {
					buscarNodo(arbol.getLeftChild(),num);
				}
				if(arbol.hasRightChild()) {
					buscarNodo(arbol.getRightChild(),num);
				}
			}
		}
		return null;
	}
	
	private int calcularSolos(BinaryTree<Integer> arbolBusca) {
		if(!arbolBusca.isEmpty()) {
			int cant = 0;
			if(arbolBusca.hasLeftChild()) {
				cant += calcularSolos(arbolBusca.getLeftChild());
			}
			if(arbolBusca.hasRightChild()) {
				cant += calcularSolos(arbolBusca.getRightChild());
			}
			
			if((arbolBusca.hasLeftChild() && !arbolBusca.hasRightChild()) || 
			  (!arbolBusca.hasLeftChild() && arbolBusca.hasRightChild())) {
				cant+=1;
			}
			return cant;
			
		}else return 0;
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(50);
		arbol.addLeftChild(new BinaryTree<Integer>(10));
		arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(20));
		arbol.addRightChild(new BinaryTree<Integer>(30));
		
		ParcialArboles a = new ParcialArboles(arbol);
		System.out.println(a.isLeftTree(10));

	}

}
