package tp2.ejercicio1;

public class TestArbol {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(30);
		
		
		arbol.addLeftChild( new BinaryTree<Integer>(22));

		arbol.getLeftChild().addLeftChild( new BinaryTree<Integer>(3));

		arbol.getLeftChild().getLeftChild().addLeftChild( new BinaryTree<Integer>(2));

		arbol.getLeftChild().getLeftChild().getLeftChild().addLeftChild( new BinaryTree<Integer>(1));
		

		arbol.addRightChild( new BinaryTree<Integer>(33));
		arbol.getRightChild().addLeftChild( new BinaryTree<Integer>(32));
		arbol.getRightChild().addRightChild( new BinaryTree<Integer>(34));
		arbol.getRightChild().getRightChild().addRightChild( new BinaryTree<Integer>(35));
		
		
		System.out.println(arbol.getData());

		System.out.println(arbol.getLeftChild().getData());

		System.out.println(arbol.getLeftChild().getLeftChild().getData());

		System.out.println(arbol.getLeftChild().getLeftChild().getLeftChild().getData());

		System.out.println(arbol.getLeftChild().getLeftChild().getLeftChild().getLeftChild().getData());
		System.out.println(arbol.getRightChild().getData());
		System.out.println(arbol.getRightChild().getRightChild().getData());
		
		System.out.println("-----------------------");
		
		arbol.entreNiveles(1, 3);
		
	}

}
