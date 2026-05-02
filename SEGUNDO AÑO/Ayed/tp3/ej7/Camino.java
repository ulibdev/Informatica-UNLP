package tp3.ej7;

import java.util.LinkedList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class Camino {
	private GeneralTree<Integer> arbol;
	public Camino(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	public List<Integer> caminoAHojaMasLejano()
	{
		GeneralTree<Integer> a2 = arbol;
		List<Integer> act = new LinkedList<Integer>();
		List<Integer> max = new LinkedList<Integer>();
		helper(a2,act,max);
		return max;
	}	
	
	public void helper(GeneralTree<Integer> a,List<Integer> act,List<Integer> max){
		if((a!= null)&&(!a.isEmpty())){
			act.add(a.getData());
			if(a.hasChildren()) {
				for(GeneralTree<Integer> h:a.getChildren()) {
					helper(h,act,max);
				}
			}else if(max.size()<act.size()) {
				max.removeAll(max);
				max.addAll(act);
			}
			act.remove(act.size()-1);
		}
	}
	public static void main(String[] args) {
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
		
		Camino cam = new Camino(a);
		List<Integer> l = cam.caminoAHojaMasLejano();
		for(Integer i:l) {
			System.out.println(i);
		}
	}

}
