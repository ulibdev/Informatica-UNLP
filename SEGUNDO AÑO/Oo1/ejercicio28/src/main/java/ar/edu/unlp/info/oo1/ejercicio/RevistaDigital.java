package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;

public class RevistaDigital extends Material implements Descargable{
	
	private int numero;
	private String nombreArchivo;
	private double pesoArchivoMB;
	
	public RevistaDigital(String titulo, LocalDate fechaIncorporacion, int numero, String nombreArchivo,
			double pesoArchivoMB) {
		super(titulo, fechaIncorporacion);
		this.numero = numero;
		this.nombreArchivo = nombreArchivo;
		this.pesoArchivoMB = pesoArchivoMB;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
		return "https://biblioteca.example.org/descargas/revistas/" + this.getNombreArchivo();
	}

	@Override
	public double tamanioEnMB() {
		return this.pesoArchivoMB;
	}
	
	

}
