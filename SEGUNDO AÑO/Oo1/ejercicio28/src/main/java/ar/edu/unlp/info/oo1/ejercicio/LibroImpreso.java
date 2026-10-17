package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;

public class LibroImpreso extends Material{
	private String autor;
	private String ubicacion;
	
	public LibroImpreso(String titulo, LocalDate fechaIncorporacion, String autor, String ubicacion) {
		super(titulo, fechaIncorporacion);
		this.autor = autor;
		this.ubicacion = ubicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
}
