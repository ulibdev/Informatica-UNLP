package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;

public class LibroDigital extends Material implements Descargable {
	
	private String autor;
	private String nombreArchivo;
	private double pesoArchivoMB;
	
	public LibroDigital(String titulo, LocalDate fechaIncorporacion, String autor, String nombreArchivo,
			double pesoArchivoMB) {
		super(titulo, fechaIncorporacion);
		this.autor = autor;
		this.nombreArchivo = nombreArchivo;
		this.pesoArchivoMB = pesoArchivoMB;
	}
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public void setPesoArchivoMB(double pesoArchivoMB) {
		this.pesoArchivoMB = pesoArchivoMB;
	}

	@Override
	public String enlaceDeDescarga() {
		return "https://biblioteca.example.org/descargas/libros/" + this.getNombreArchivo();
	}

	@Override
	public double tamanioEnMB() {
		return this.pesoArchivoMB;
	}
	
	
	
}
