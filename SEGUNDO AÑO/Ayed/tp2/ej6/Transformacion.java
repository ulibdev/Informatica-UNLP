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
		
		BinaryTree<Integer> arbolNuevo = new BinaryTree<Integer>(0);
		proceso(this.getArbol(),arbolNuevo);
		return arbolNuevo;
	}
	
	private int proceso(BinaryTree<Integer> arbol,BinaryTree<Integer> arbolNuevo){
		
		if(!arbol.isEmpty()) {
			int cant = 0;
			int act = arbol.getData();
			
			BinaryTree<Integer> hi = new BinaryTree<Integer>(0);
			BinaryTree<Integer> hd = new BinaryTree<Integer>(0);
			if(arbol.hasLeftChild()) {
				cant += proceso(arbol.getLeftChild(),hi);
				arbolNuevo.addLeftChild(hi);
			}
			if(arbol.hasRightChild()) {
				cant += proceso(arbol.getRightChild(),hd);
				arbolNuevo.addRightChild(hd);
			}
			arbolNuevo.setData(cant);
			return cant + act;
		}else return 0;
	}
	

	
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(5);
		arbol.addLeftChild(new BinaryTree<Integer>(5));
		arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(5));
		arbol.addRightChild(new BinaryTree<Integer>(5));
		
		Transformacion a = new Transformacion(arbol);
		BinaryTree<Integer> arbol2 = a.suma();
		arbol2.entreNiveles(0, 3);

	}

}
