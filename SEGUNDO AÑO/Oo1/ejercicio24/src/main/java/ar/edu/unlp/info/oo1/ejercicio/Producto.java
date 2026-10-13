package ar.edu.unlp.info.oo1.ejercicio;

public class Producto {
	private String nombre;
	private String tipoDeMaterial;
	private double costo;
	private boolean esBiodegradable;
	
	public Producto(String nombre, String tipoDeMaterial, double costo, boolean esBiodegradable) {
		this.nombre = nombre;
		this.tipoDeMaterial = tipoDeMaterial;
		this.costo = costo;
		this.esBiodegradable = esBiodegradable;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDeMaterial() {
		return tipoDeMaterial;
	}
	public void setTipoDeMaterial(String tipoDeMaterial) {
		this.tipoDeMaterial = tipoDeMaterial;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public boolean isEsBiodegradable() {
		return esBiodegradable;
	}
	public void setEsBiodegradable(boolean esBiodegradable) {
		this.esBiodegradable = esBiodegradable;
	}
	
	
}
