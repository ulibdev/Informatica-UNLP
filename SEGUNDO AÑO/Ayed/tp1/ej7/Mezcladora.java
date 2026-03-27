package tp1.ej7;

import java.util.ArrayList;

public class Mezcladora {

	
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> l1, ArrayList<Integer> l2){
		
		ArrayList<Integer> listaNueva = new ArrayList();
		if(!l1.isEmpty() && !l2.isEmpty()) {
			int i = 0;
			int j = 0;
			while(i <l1.size() && j <l2.size()) {
				if(l1.get(i) < l2.get(j)) {
					listaNueva.add(l1.get(i));
					i++;
				}else {
					listaNueva.add(l2.get(j));
					j++;
				}
			}
			if(i<l1.size()) {
				for(int a = i;a<l1.size();a++) {
					listaNueva.add(l1.get(a));
				}
				
			}
			if(j<l2.size()) {
				for(int a = j;a<l1.size();a++) {
					listaNueva.add(l1.get(a));
				}
			}
			
		}else if(l1.isEmpty()) {
			listaNueva.addAll(l2);
		}else if (l2.isEmpty())listaNueva.addAll(l1);
		
		return listaNueva;
	}
	
}
