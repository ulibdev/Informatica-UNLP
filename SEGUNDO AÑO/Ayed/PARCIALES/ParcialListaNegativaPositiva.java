package PARCIALES;

import java.util.LinkedList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class ParcialListaNegativaPositiva {

	public static List<Integer> caminoSignoAlternativo(GeneralTree<Integer> arbol){
		List<Integer> max = new LinkedList<Integer>();
		List<Integer> act = new LinkedList<Integer>();
		helper(act,max,arbol);
		return max;
	}
	private static Integer contar(List<Integer> l) {
		Integer num = 0;
		if(l.size()>0) {
			for(Integer i:l)num+=i;
		}
		return num;
	}
	
	private static void helper(List<Integer> act,List<Integer> max,GeneralTree<Integer> arbol) {
		if((arbol != null) && (!arbol.isEmpty())) {
			act.add(arbol.getData());
			if(arbol.hasChildren()) {
				for(GeneralTree<Integer> h : arbol.getChildren()){
					if(((arbol.getData()<0) && (h.getData()>=0)) || ((arbol.getData() >=0) && (h.getData() < 0))){
						helper(act,max,h);
					}
				}
			}else {
				if(max.size() == 0) {
					max.addAll(act);
				}
				else if(contar(act) >contar(max)) {
					max.clear();
					max.addAll(act);
				}
			}
			act.remove(act.size()-1);
		}
	}
	
	public static void main(String[] args) {
		
		GeneralTree<Integer> a = new GeneralTree<Integer>(-1);
		GeneralTree<Integer> b = new GeneralTree<Integer>(-10);
		GeneralTree<Integer> c = new GeneralTree<Integer>(-1);
		GeneralTree<Integer> d = new GeneralTree<Integer>(-8);
		GeneralTree<Integer> e = new GeneralTree<Integer>(1);
		GeneralTree<Integer> f = new GeneralTree<Integer>(-2);
		GeneralTree<Integer> g = new GeneralTree<Integer>(3);
		
		b.addChild(g);
		a.addChild(b);
		c.addChild(e);
		c.addChild(f);
		a.addChild(c);
		a.addChild(d);
		
		List<Integer> l = ParcialListaNegativaPositiva.caminoSignoAlternativo(a);
		for(Integer i : l)System.out.println(i);

	}

}
