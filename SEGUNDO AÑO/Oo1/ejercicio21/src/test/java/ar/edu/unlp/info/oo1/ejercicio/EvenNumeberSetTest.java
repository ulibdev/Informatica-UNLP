package ar.edu.unlp.info.oo1.ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenNumeberSetTest {

	Set<Integer> coleccion1;

	Set<Integer> coleccion2;
	
	@BeforeEach
	void setup() {
		coleccion1 = new EvenNumberSet();

		coleccion2= new EvenNumberSet();
	}
	
	@Test
	void addTest() {
		assertEquals(true,coleccion1.add(2));
		assertEquals(false,coleccion2.add(1));
	}
	
	@Test
	void addAllTest() {
		List<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(4);
		lista2.add(2);
		assertEquals(true,coleccion1.addAll(lista2));
		assertEquals(false,coleccion2.addAll(lista1));
	}
	
}
