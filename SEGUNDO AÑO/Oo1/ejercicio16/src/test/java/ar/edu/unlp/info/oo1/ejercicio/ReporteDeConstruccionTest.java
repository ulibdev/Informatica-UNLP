package ar.edu.unlp.info.oo1.ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	private ReporteDeConstruccion rdcVacio;
	private ReporteDeConstruccion rdcSinColor;
	private ReporteDeConstruccion rdcNormal;
	
	@BeforeEach
	void setUp() {
		rdcVacio = new ReporteDeConstruccion();
		rdcSinColor = new ReporteDeConstruccion();
		rdcNormal = new ReporteDeConstruccion();
	}
	
	@Test
	void testVacio(){
		assertEquals(0, rdcVacio.volumenDeMaterial("noexiste"));
		assertEquals(0, rdcVacio.superficieDeColor("noexiste"));
	}
	
	@Test
	void testSinColor(){
		Pieza pieza1 = new Cilindro("Algarrobo","verde",3,3);
		Pieza pieza2 = new Cilindro("Algarrobo","verde",3,3);
		Pieza pieza3 = new Cilindro("Algarrobo","marron",4,4);
		rdcSinColor.addPieza(pieza1);
		rdcSinColor.addPieza(pieza2);
		rdcSinColor.addPieza(pieza3);
		assertEquals(0, rdcSinColor.volumenDeMaterial("marmol"));
		assertEquals(0, rdcSinColor.superficieDeColor("azul"));
	}
	@Test
	void testNormal(){
		Pieza pieza1 = new Cilindro("Madera","verde",3,3);
		Pieza pieza2 = new Esfera("Madera","verde",3);
		Pieza pieza3 = new Cilindro("Algarrobo","marron",4,4);
		rdcNormal.addPieza(pieza1);
		rdcNormal.addPieza(pieza2);
		rdcNormal.addPieza(pieza3);
		assertEquals(64 * Math.PI, rdcNormal.volumenDeMaterial("Algarrobo"));
		assertEquals(72 * Math.PI, rdcNormal.superficieDeColor("verde"));
	}
}
