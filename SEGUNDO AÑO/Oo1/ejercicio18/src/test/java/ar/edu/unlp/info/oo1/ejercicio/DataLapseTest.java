package ar.edu.unlp.info.oo1.ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataLapseTest {
	private DataLapse datanormal;
	private DataLapse datadiasalreves;
	private DataLapse datavacio;
	
	
	@BeforeEach
	void setup() {
		datanormal = new DataLapse(LocalDate.of(2026,10,10),LocalDate.now());
		datadiasalreves = new DataLapse(LocalDate.now(),LocalDate.of(2026,10,10));
		datavacio = new DataLapse(null, null);
	}
	
	@Test
	void testSizeInDays() {
		assertEquals(2, datanormal.sizeInDays());
		assertEquals(-2, datadiasalreves.sizeInDays());//que onda aca? deberia dar -2 o asumir que no pasara
		assertEquals(0, datavacio.sizeInDays());
	}
	
	@Test
	void includesDateTest() {
		assertEquals(true, datanormal.includesDate(LocalDate.of(2026, 10, 11)));
		assertEquals(false, datanormal.includesDate(LocalDate.of(2026, 10, 13)));
		assertEquals(false, datanormal.includesDate(null));
	}
}
