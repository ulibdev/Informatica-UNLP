package ar.edu.unlp.info.oo1.ejercicio;

public class Tecnico {
	private String nombreCompleto;
	private String especialidad;
	private double valorPorHora;
	public Tecnico(String nombreCompleto, String especialidad, double valorPorHora) {
		this.nombreCompleto = nombreCompleto;
		this.especialidad = especialidad;
		this.valorPorHora = valorPorHora;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	
	
}
