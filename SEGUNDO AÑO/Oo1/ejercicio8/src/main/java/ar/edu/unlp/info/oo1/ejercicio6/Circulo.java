package ar.edu.unlp.info.oo1.ejercicio6;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo() {
	}
	
	
	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double getDiametro() {
		return this.getRadio() *2;
	}
	
	public void setDiametro(double diametro) {
		this.setRadio(diametro/2);
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	public double getArea() {
		return Math.PI * (this.getRadio() * this.getRadio());
	}
}
