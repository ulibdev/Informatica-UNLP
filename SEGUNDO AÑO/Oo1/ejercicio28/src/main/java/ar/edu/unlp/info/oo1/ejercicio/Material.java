package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Material {
	private String titulo;
	private LocalDate fechaIncorporacion;
	
	public Material(String titulo, LocalDate fechaIncorporacion) {
		this.titulo = titulo;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public int antiguedad() {
		return (int) ChronoUnit.YEARS.between(this.getFechaIncorporacion(),LocalDate.now());
	}
	
	public boolean incorporacionAntesDe(int anio) {
		return this.getFechaIncorporacion().getYear()< anio;
	}
}
