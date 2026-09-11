package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		productos = new ArrayList<Producto>();
	}
	
	public void ponerEnCero() {
		productos.clear();
	}
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public List<Producto> getProductos(){
		return this.productos;
	}

	public double getPrecioTotal() {
		Iterator<Producto> it = productos.iterator();
		double precioTotal = 0;
		while(it.hasNext())precioTotal+=it.next().getPrecio();
		return precioTotal;
	}

	public double getPesoTotal() {
		Iterator<Producto> it = productos.iterator();
		double pesoTotal = 0;
		while(it.hasNext())pesoTotal+=it.next().getPeso();
		return pesoTotal;
	}
	
	

	public Ticket emitirTicket() {
		return new Ticket(this.getProductos());
	}
	
}
