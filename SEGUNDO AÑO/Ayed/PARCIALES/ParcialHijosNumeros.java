package PARCIALES;

import java.util.LinkedList;
import java.util.List;

import tp1.ej8.Queue;
import tp3.ej1.GeneralTree;

public class ParcialHijosNumeros {

	private GeneralTree<Integer> arbol;
	public ParcialHijosNumeros(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public List<Integer> nivel(int num){
		List<Integer> lista = new LinkedList<Integer>();
		if((this.arbol != null) && (!this.arbol.isEmpty())){
			Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
			boolean tiene = true;
			cola.enqueue(this.arbol);
			cola.enqueue(null);
			
			while(!cola.isEmpty()) {
				GeneralTree<Integer>aux = cola.dequeue();
				if(aux != null) {
					if(aux.hasChildren()) {
						List<GeneralTree<Integer>> hijo = aux.getChildren();
						for(GeneralTree<Integer> h:hijo) {
							cola.enqueue(h);
						}
						if((hijo.size()>= num) && (tiene)){
							lista.add(aux.getData());
						}else if(tiene) tiene = false;
					}else tiene = false;
				}else {
					if(tiene) {
						int auxi = cola.size();
						for(int i=0; i<auxi;i++)cola.dequeue();
					}else {
						if(!cola.isEmpty()) {
							cola.enqueue(null);
							tiene = true;
							}
						lista.clear();
						}
					}
				}
			}
		return lista;
		}
	
	public static void main(String[] args) {
		GeneralTree<Integer> a = new GeneralTree<Integer>(10);
		GeneralTree<Integer> b = new GeneralTree<Integer>(8);
		GeneralTree<Integer> c = new GeneralTree<Integer>(-5);
		
		GeneralTree<Integer> d = new GeneralTree<Integer>(5);
		GeneralTree<Integer> e = new GeneralTree<Integer>(22);
		GeneralTree<Integer> f = new GeneralTree<Integer>(19);
		
		GeneralTree<Integer> g = new GeneralTree<Integer>(-6);
		GeneralTree<Integer> h = new GeneralTree<Integer>(2);
		GeneralTree<Integer> p = new GeneralTree<Integer>(8);
		
		GeneralTree<Integer> j = new GeneralTree<Integer>(28);
		GeneralTree<Integer> k = new GeneralTree<Integer>(55);
		GeneralTree<Integer> l = new GeneralTree<Integer>(18);
		
		GeneralTree<Integer> m = new GeneralTree<Integer>(4);
		GeneralTree<Integer> n = new GeneralTree<Integer>(2);
		GeneralTree<Integer> o = new GeneralTree<Integer>(8);
		
		
		a.addChild(b);
		a.addChild(c);
		
		b.addChild(d);
		b.addChild(e);
		
		c.addChild(f);
		
		d.addChild(g);
		d.addChild(h);
		d.addChild(p);
		
		
		e.addChild(j);
		e.addChild(k);
		e.addChild(l);
		
		
		f.addChild(m);
		f.addChild(n);
		f.addChild(o);
		
		
		ParcialHijosNumeros par = new ParcialHijosNumeros(a);
		for(Integer i: par.nivel(3)) {
			System.out.println(i);
		}
	}

}
