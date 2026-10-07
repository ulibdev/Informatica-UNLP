package ar.edu.unlp.info.oo1.ejercicio;

public class Cilindro extends Pieza{

	private double radio;
	private double altura;
	
	public Cilindro(String material, String color, double radio, double altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura(); 
	}

	@Override
	public double getSuperficie() {
		return (2 * Math.PI * this.getRadio() * this.getAltura())
				+
				2 * Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double getRadio() {
		return radio;
	}

	public double getAltura() {
		return altura;
	}
	
	

}
