package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
public class Ticket {
	
	private LocalDate fecha;
	private Integer cantidadDeProductos;
	private Double pesoTotal;
	private Double precioTotal;
	
	public Ticket(Integer cantidadDeProductos, Double pesoTotal, Double precioTotal) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.fecha = fecha.now();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public Double impuesto() {
		return this.precioTotal * 0.21;
	}

	public Integer getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Double getPesoTotal() {
		return this.pesoTotal;
	}

	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public Double getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
}
