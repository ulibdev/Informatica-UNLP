package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> compras;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		fecha = fecha.now();
		compras = new ArrayList<Item>();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
	public void agregarItem(Item cosa) {
		compras.add(cosa);
	}
	
	public double calcularTotal() {
		Iterator<Item> it = compras.iterator();
		double total = 0;
		while(it.hasNext())total+=it.next().costo();
		return total;
	}
}
