package ar.edu.unlp.info.oo1.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		
		this.piezas = new ArrayList<Pieza>();
	}

	public void addPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	
	public double volumenDeMaterial(String material) {
		double resultado = this.piezas.stream().filter(Pieza -> Pieza.getMaterial() == material)
												.mapToDouble(Pieza -> Pieza.getVolumen())
												.sum();
		return resultado;	
	}
	
	public double superficieDeColor(String color) {
		double resultado = this.piezas.stream().filter(Pieza -> Pieza.getColor() == color)
				.mapToDouble(Pieza -> Pieza.getSuperficie())
				.sum();
		return resultado;
	}
}
