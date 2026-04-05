package tp2.ej6;

import tp2.ejercicio1.BinaryTree;

public class Transformacion {

	private BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	public BinaryTree<Integer> getArbol(){
		return this.arbol;
	}
	
	public BinaryTree<Integer> suma(){
		
		proceso(this.getArbol());
		return this.getArbol();
	}
	
	private int proceso(BinaryTree<Integer> arbol){
		
		if(!arbol.isEmpty()) {
			int cant = 0;
			int act = arbol.getData();
			if(arbol.isLeaf()) {
				arbol.setData(0);
				return act;
			}
			if(arbol.hasLeftChild()) {
				cant += proceso(arbol.getLeftChild());
			}
			if(arbol.hasRightChild()) {
				cant += proceso(arbol.getRightChild());
			}
			
			arbol.setData(cant);
			return cant + act;
		}else return 0;
	}
	

	
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(5);
		arbol.addLeftChild(new BinaryTree<Integer>(5));
		arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(5));
		arbol.addRightChild(new BinaryTree<Integer>(5));
		
		Transformacion a = new Transformacion(arbol);
		a.suma();
		arbol.entreNiveles(0, 3);

	}

}
