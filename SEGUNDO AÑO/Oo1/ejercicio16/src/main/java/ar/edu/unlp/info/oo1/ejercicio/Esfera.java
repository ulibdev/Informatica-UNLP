package ar.edu.unlp.info.oo1.ejercicio;

public class Esfera extends Pieza {
	private double radio;

	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public double getVolumen() {
		return 4.0/3.0 * Math.PI * Math.pow(radio, 3);
	}

	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
		
}
