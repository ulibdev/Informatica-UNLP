package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(String descripcion,double peso, double precioPorKilo) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	public double getPrecio() {
		return this.getPrecioPorKilo() * this.getPeso();
	}
	public double getPeso() {
		return this.peso;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
}
