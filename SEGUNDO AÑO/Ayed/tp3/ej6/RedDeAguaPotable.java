package tp3.ej6;

import java.util.List;

import tp3.ej1.GeneralTree;

public class RedDeAguaPotable {

	private GeneralTree<Character> arbol;
	
	public RedDeAguaPotable(GeneralTree<Character> arbol) {
		this.arbol = arbol;
	}
	
	public double minimoCaudal(double caudal) {
		GeneralTree<Character> a2=arbol;
		double min = minCaudalHelper(a2,caudal);
		return min;
	}
	
	private double minCaudalHelper(GeneralTree<Character> a,double caudal) {
		if(a == null) return -1;
		if(a.isEmpty()) return -1;
		if(a.isLeaf()) return caudal;
		List<GeneralTree<Character>> l = a.getChildren();
		caudal /= (double)l.size();
		double min = caudal;
		for(GeneralTree<Character> h:l) {
			min = Math.min(minCaudalHelper(h,caudal),min);
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		GeneralTree<Character> a = new GeneralTree<Character>('A');
		GeneralTree<Character> b = new GeneralTree<Character>('B');
		GeneralTree<Character> c = new GeneralTree<Character>('C');
		GeneralTree<Character> d = new GeneralTree<Character>('D');
		GeneralTree<Character> e = new GeneralTree<Character>('E');
		GeneralTree<Character> f = new GeneralTree<Character>('F');
		GeneralTree<Character> g = new GeneralTree<Character>('G');
		
		b.addChild(g);
		a.addChild(b);
		c.addChild(e);
		c.addChild(f);
		a.addChild(c);
		a.addChild(d);
		RedDeAguaPotable red = new RedDeAguaPotable(a);
		System.out.println(red.minimoCaudal(900));
		
		
		

	}

}
