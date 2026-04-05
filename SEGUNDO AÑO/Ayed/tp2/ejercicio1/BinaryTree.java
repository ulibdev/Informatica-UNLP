package tp2.ejercicio1;

import tp1.ej8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
	   int cant = 0;
	   if(!this.isEmpty()){
		   cant+=1;
		   if(this.hasLeftChild()) {
			   cant+=this.getLeftChild().contarHojas();
		   }
		   if(this.hasRightChild()) {
			   cant+=this.getRightChild().contarHojas();
		   }
	   }
	   return cant;
		
	}
		
		
    	 
    public BinaryTree<T> espejo(){
    	
    	BinaryTree<T> arbol = new BinaryTree<T>(this.getData());
    	if(!this.isEmpty()) {
    		espejoProceso(this,arbol);
    	}
    	return arbol;
    }
    
    private void espejoProceso(BinaryTree<T> arbolNext,BinaryTree<T> arbol) {
    	if(arbolNext.hasLeftChild()) {
			BinaryTree<T> arbolIzq = new BinaryTree<T>(arbolNext.getLeftChild().getData());
			arbol.addRightChild(arbolIzq);
			espejoProceso(arbolNext.getLeftChild(),arbol.getRightChild());
		}
		if(arbolNext.hasRightChild()) {
			BinaryTree<T> arbolDer = new BinaryTree<T>(arbolNext.getRightChild().getData());
			arbol.addLeftChild(arbolDer);
			espejoProceso(arbolNext.getRightChild(),arbol.getLeftChild());
		}
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if(!this.isEmpty()) {
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		int lvl = 0;
		cola.enqueue(this);
		while(!cola.isEmpty()) {
			int cant = cola.size();
			for(int i = 0;i<cant;i++) {
				BinaryTree<T> arbol = cola.dequeue();
				if(lvl<m) {
					if(arbol.hasLeftChild())cola.enqueue(arbol.getLeftChild());
					if(arbol.hasRightChild())cola.enqueue(arbol.getRightChild());
				}
				if(lvl>=n) {
					System.out.println("LVL "+lvl + ":"+ arbol.toString());
				}
			}
			lvl+=1;
			}
		}
	}
		
	
	
}

