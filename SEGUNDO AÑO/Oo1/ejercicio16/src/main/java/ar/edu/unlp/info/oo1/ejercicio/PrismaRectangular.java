package ar.edu.unlp.info.oo1.ejercicio;

public class PrismaRectangular extends Pieza {
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}

	public double getLadoMayor() {
		return ladoMayor;
	}

	public double getLadoMenor() {
		return ladoMenor;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double getVolumen() {
		return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
	}

	@Override
	public double getSuperficie() {
		return 2*(this.getLadoMayor() * this.getLadoMenor() + 
				this.getLadoMayor() * this.getAltura() + 
				this.getLadoMenor() * this.getAltura() );
	}
	
	
}
