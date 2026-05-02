package tp3.ej11;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class ParcialArboles {
	public static boolean resolver(GeneralTree<Integer> arbol) {
		if((arbol != null) &&(!arbol.isEmpty())){
			Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
			Integer act = 0;
			Integer ant = 0;
			boolean esCreciente = true;
			cola.enqueue(arbol);
			cola.enqueue(null);
			while((!cola.isEmpty())&&(esCreciente)) {
				GeneralTree<Integer> a = cola.dequeue();
				if(a != null) {
					act+=1;
					if(a.hasChildren()) {
						for(GeneralTree<Integer> h:a.getChildren()) {
							cola.enqueue(h);
						}
					}
				}
				else {
					if(ant == (act -1)) {
						if(!cola.isEmpty()) {
							cola.enqueue(null);
						}
						ant = act;
						act = 0;
					}else esCreciente = false;
				}
			}return esCreciente;
		}else return false;
	}
	
	public static void main(String[]args) {
		GeneralTree<Integer> a = new GeneralTree<Integer>(0);
		GeneralTree<Integer> b = new GeneralTree<Integer>(1);
		GeneralTree<Integer> c = new GeneralTree<Integer>(2);
		GeneralTree<Integer> d = new GeneralTree<Integer>(3);
		GeneralTree<Integer> e = new GeneralTree<Integer>(4);
		GeneralTree<Integer> f = new GeneralTree<Integer>(5);
		GeneralTree<Integer> g = new GeneralTree<Integer>(6);
		
	
		b.addChild(g);
		a.addChild(b);
		c.addChild(e);
		c.addChild(f);
		a.addChild(c);
		a.addChild(d);
		
		
		System.out.println(ParcialArboles.resolver(a));
	}
}
