package tp3.ej4;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class AnalizadorArbol {

	public double devolvermaximopromedio(GeneralTree<AreaEmpresa> arbol) {
		double prom =0;
		if(arbol != null && !arbol.isEmpty()) {
			Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
			cola.enqueue(arbol);
			cola.enqueue(null);
			double act = 0;
			double cant = 0;
			while(!cola.isEmpty()) {
				GeneralTree<AreaEmpresa> aux = cola.dequeue();
				if(aux != null) {
					act += aux.getData().getTransmision();
					cant+=1;
					if(aux.hasChildren()) {
						for(GeneralTree<AreaEmpresa> hijo : aux.getChildren()){
							cola.enqueue(hijo);
						}
					}
				}
				else {	
					if(!cola.isEmpty())cola.enqueue(null);
					act/=cant;
					if(prom <act) prom = act;
					act = 0;cant = 0;
				}
			}
		}
		return prom;
	}
	
	public static void main(String[] args) {

		AnalizadorArbol aa = new AnalizadorArbol();
		AreaEmpresa a = new AreaEmpresa("1",2);
		GeneralTree<AreaEmpresa> ar = new GeneralTree<AreaEmpresa>(a); 
		System.out.println(aa.devolvermaximopromedio(ar));
		a = new AreaEmpresa("2",3);
		GeneralTree<AreaEmpresa> h = new GeneralTree<AreaEmpresa>(a); 
		ar.addChild(h);
		ar.addChild(h);
		a = new AreaEmpresa("2",8);
		h.addChild( new GeneralTree<AreaEmpresa>(a) );
		h.addChild( new GeneralTree<AreaEmpresa>(a) );
		ar.addChild(h);
		
		
		System.out.println(aa.devolvermaximopromedio(ar));
		
	}
}
