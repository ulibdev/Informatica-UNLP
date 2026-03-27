package tp1.ej8;

public class DoubleEndedQueue <T> extends Queue <T>{
	
	public void enqueueFirst (T dato) {
		super.lista.add(0,dato);
	}
}
