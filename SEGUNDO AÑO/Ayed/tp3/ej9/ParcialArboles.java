package tp3.ej9;

import tp3.ej1.GeneralTree;

public class ParcialArboles {

	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		if(arbol != null && !arbol.isEmpty()) {
			boolean esIgual = true;
			if(arbol.hasChildren()) {
				esIgual = false;
				for(GeneralTree<Integer>h:arbol.getChildren()) {
					System.out.println(arbol.getData() +" " + h.getData());
					if(arbol.getData() == h.getData()) {
						esIgual = true;
						break;
					}
				}
				if(esIgual) {
					for(GeneralTree<Integer>h:arbol.getChildren()) {
						if(!h.isLeaf()) {
							esIgual = esDeSeleccion(h);
						}
				}
			}
		}return esIgual;
	}
		return false;
}	
	public static void main(String[] args) {
		GeneralTree<Integer> a = new GeneralTree<Integer>(0);
		GeneralTree<Integer> b = new GeneralTree<Integer>(0);
		GeneralTree<Integer> c = new GeneralTree<Integer>(2);
		GeneralTree<Integer> d = new GeneralTree<Integer>(3);
		GeneralTree<Integer> e = new GeneralTree<Integer>(4);
		GeneralTree<Integer> f = new GeneralTree<Integer>(2);
		GeneralTree<Integer> g = new GeneralTree<Integer>(0);
		
		b.addChild(g);
		a.addChild(b);
		c.addChild(e);
		c.addChild(f);
		a.addChild(c);
		a.addChild(d);
		System.out.println(ParcialArboles.esDeSeleccion(a));
		

	}

}
