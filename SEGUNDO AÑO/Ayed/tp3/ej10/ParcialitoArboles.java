package tp3.ej10;

import java.util.LinkedList;
import java.util.List;

import tp3.ej1.GeneralTree;

public class ParcialitoArboles {

	public static List<Integer> resolver (GeneralTree<Integer> arbol){
		List<Integer> act = new LinkedList<Integer>();
		List<Integer> max = new LinkedList<Integer>();
		helper(arbol,act,max,0);
		Integer cant = max.size();
		max.removeAll(max);
		for(int i=0;i<cant;i++) max.add(1);
		return max;
	}
	private static void helper(GeneralTree<Integer> a,List<Integer> act,List<Integer> max,Integer lvl) {
		if((a!= null)&&(!a.isEmpty())) {
			Integer num = a.getData();
			if(num == 1) {
				act.add(num * lvl);
			}
			if(a.isLeaf()) {
				num = 0;
				Integer maxi = 0;
				if(!act.isEmpty()) {for(Integer i:act)num+=i;}
				if(!max.isEmpty()) {for(Integer i:max)maxi+=i;}
				if(maxi<num) {
					max.removeAll(max);
					max.addAll(act);
				}
			}else {
				for(GeneralTree<Integer> h: a.getChildren()) {
					helper(h,act,max,lvl+1);
				}
			}
			if(!act.isEmpty())act.remove(act.size() -1);
		}
	}
	
	
	public static void main(String[] args) {
		GeneralTree<Integer> a = new GeneralTree<Integer>(0);
		GeneralTree<Integer> b = new GeneralTree<Integer>(0);
		GeneralTree<Integer> c = new GeneralTree<Integer>(1);
		GeneralTree<Integer> d = new GeneralTree<Integer>(0);
		GeneralTree<Integer> e = new GeneralTree<Integer>(0);
		GeneralTree<Integer> f = new GeneralTree<Integer>(0);
		GeneralTree<Integer> g = new GeneralTree<Integer>(1);
		
		b.addChild(g);
		a.addChild(b);
		c.addChild(e);
		c.addChild(f);
		a.addChild(c);
		a.addChild(d);
		
		List<Integer> l = ParcialitoArboles.resolver(a);
		for(Integer i : l)System.out.println(i);
	}

}
