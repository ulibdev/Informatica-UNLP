package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
public class Ticket {
	
	private LocalDate fecha;
	List<Producto> productos;
	
	public Ticket(List<Producto> productos) {
		this.productos = productos;
		this.fecha = fecha.now();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPesoTotal() {
		Iterator<Producto> it = productos.iterator();
		double pesoTotal = 0;
		while(it.hasNext())pesoTotal+=it.next().getPeso();
		return pesoTotal;
	}


	public double getPrecioTotal() {
		Iterator<Producto> it = productos.iterator();
		double precioTotal = 0;
		while(it.hasNext())precioTotal+=it.next().getPrecio();
		return precioTotal;
	}

}
