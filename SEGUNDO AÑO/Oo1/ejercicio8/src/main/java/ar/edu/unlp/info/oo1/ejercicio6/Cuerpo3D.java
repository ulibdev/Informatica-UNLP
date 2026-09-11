package ar.edu.unlp.info.oo1.ejercicio6;

public class Cuerpo3D {
	
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Figura carabasal) {
		this.caraBasal = carabasal;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * altura;
	}
	public double getSuperficieExterior() {
		return 2*this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.getAltura();
	}
	

}
