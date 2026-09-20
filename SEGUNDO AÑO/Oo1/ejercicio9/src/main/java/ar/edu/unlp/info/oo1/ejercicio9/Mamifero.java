package ar.edu.unlp.info.oo1.ejercicio9;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return this.padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return this.madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.getMadre() != null)return this.getMadre().getPadre();
		else return null;
	}
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre() != null)return this.getMadre().getMadre();
		else return null;
		            
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre() != null)return this.getPadre().getPadre();
		else return null;
		
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre() != null)return this.getPadre().getMadre();
		else return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		boolean encontre = false;
		if(this.getPadre() != null){
			if(this.getPadre().getIdentificador().equals(mamifero.getIdentificador())){
				encontre = true;
			}else encontre = this.getPadre().tieneComoAncestroA(mamifero);
		}
		if(this.getMadre() != null && !encontre){
			if(this.getMadre().getIdentificador().equals(mamifero.getIdentificador())){
				encontre = true;
			}else encontre = this.getMadre().tieneComoAncestroA(mamifero);
		}
		return encontre;
		
	}
	
	
}
