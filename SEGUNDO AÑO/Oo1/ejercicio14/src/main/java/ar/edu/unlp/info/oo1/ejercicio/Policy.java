package ar.edu.unlp.info.oo1.ejercicio;

import java.util.List;

public abstract class Policy {
	private String nombre;
	public Policy(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract JobDescription next(List<JobDescription> jobs);

	public String getNombre() {
		return nombre;
	}
}
