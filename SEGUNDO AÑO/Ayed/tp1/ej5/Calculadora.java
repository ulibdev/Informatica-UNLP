package tp1.ej5;

public class Calculadora {
	
	private Datos d;
	
	public static Datos retornar (int[] vector) {
		int max = 0;
		int min = 9999;
		int prom = 0;
		for (int i = 0;i<vector.length; i++) {
			if(vector[i]< min)min = vector[i];
			if(vector[i]> max)max = vector[i];
			prom+=vector[i];
		}
		Datos dat = new Datos(max,min,prom);
		return dat;
	}
	public static void retornar2(int[] arreglo, Datos dat) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i < arreglo.length; i++) {
            if(arreglo[i] > max) max = arreglo[i];
            if(arreglo[i] < min) min = arreglo[i];
            sum+= arreglo[i];
        }
        dat.setMax(max);
        dat.setMin(min);
        dat.setProm(sum/arreglo.length);
    }
}
