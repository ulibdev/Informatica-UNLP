package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Orden {
	private LocalDate fecha;
	private String domicilio;
	private List<Producto> productos;
	
	
	public Orden(String domicilio) {
		this.domicilio = domicilio;
		this.fecha = fecha.now();
		this.productos = new ArrayList<Producto>();
	}
	
	public abstract double calcularCosto();

	public LocalDate getFecha() {
		return fecha;
	}
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	
	public List<Producto> getProductos() {
		return productos;
	}

	public String getDomicilio() {
		return domicilio;
	}
	
}
