package tp2.ej3;

import java.util.ArrayList;
import java.util.List;

import tp2.ejercicio1.BinaryTree;

public class ContadorArbol {

	private BinaryTree<Integer> arbol;
	
	public ContadorArbol( BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	public List<Integer> NumerosPares(){
		List<Integer> lista = new ArrayList<>();
		
		recorrerArbolPreOrden(this.arbol,lista);
		return lista;
	}
	
	private void recorrerArbolPreOrden(BinaryTree<Integer> arbol,List<Integer> lista) {
		if(!arbol.isEmpty()) {
			if(arbol.getData() % 2 == 0)lista.add(arbol.getData());
			if(arbol.hasLeftChild())recorrerArbolPreOrden(arbol.getLeftChild(),lista);
			if(arbol.hasRightChild())recorrerArbolPreOrden(arbol.getRightChild(),lista);
		}
	}
	private void recorrerArbolInOrden(BinaryTree<Integer> arbol,List<Integer> lista) {
		if(!arbol.isEmpty()) {
			
			if(arbol.hasLeftChild())recorrerArbolPreOrden(arbol.getLeftChild(),lista);
			if(arbol.getData() % 2 == 0)lista.add(arbol.getData());
			if(arbol.hasRightChild())recorrerArbolPreOrden(arbol.getRightChild(),lista);
		}
	}
	private void recorrerArbolPostOrden(BinaryTree<Integer> arbol,List<Integer> lista) {
		if(!arbol.isEmpty()) {
			if(arbol.hasLeftChild())recorrerArbolPreOrden(arbol.getLeftChild(),lista);
			if(arbol.hasRightChild())recorrerArbolPreOrden(arbol.getRightChild(),lista);
			if(arbol.getData() % 2 == 0)lista.add(arbol.getData());
	
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(31);
		arbol.addLeftChild(new BinaryTree<Integer>(30));
		arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(29));
		arbol.addRightChild(new BinaryTree<Integer>(34));
		ContadorArbol a = new ContadorArbol(arbol);
		List<Integer> lista = a.NumerosPares();
		for(Integer ab:lista) {
			System.out.println(ab);
		}

	}

}
