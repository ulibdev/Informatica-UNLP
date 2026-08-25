package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;
	
	public Producto(String descripcion,double peso, double precioPorKilo) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public Double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	public Double getPrecio() {
		return this.getPrecioPorKilo() * this.getPeso();
	}
	public Double getPeso() {
		return this.peso;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
}
