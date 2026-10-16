package ar.edu.unlp.info.oo1.ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapTest {
	
	private Map<String, Integer> diccionario;
	
	@BeforeEach
	void setup() {
		diccionario = new HashMap<String,Integer>();
		diccionario.put("Lionel Messi", 111);
		diccionario.put("Gabriel Batistuta", 56);
		diccionario.put("Kun Agüero", 42);
	}
	
	@Test
	void agregar() {
		assertEquals(111,diccionario.get("Lionel Messi"));
		assertEquals(56,diccionario.get("Gabriel Batistuta"));
		assertEquals(42,diccionario.get("Kun Agüero"));
	}
	
	@Test
	void eliminar() {
		diccionario.remove("Kun Agüero");
		assertEquals(null,diccionario.get("Kun Agüero"));
	}
	
	@Test
	void actualizar(){
		diccionario.replace("Lionel Messi", 112);
		assertEquals(112,diccionario.get("Lionel Messi"));
	}
	
	@Test
	void repetir() {
		assertEquals(0,diccionario.put("Gabriel Batistuta", 0));
	}
	
	@Test
	void totalgoles() {
		assertEquals(209,diccionario.values().stream().mapToInt(d -> d).sum());
	}
	
	

}
