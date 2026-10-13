package ar.edu.unlp.info.oo1.ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {
	
	private Usuario usuario;
	
	@BeforeEach
	void setup(){
		usuario = new Usuario("Juan Martinez","Larrea 5800, Mar del Plata");
	}
	
	@Test
	void costosTest() {
		Producto panel = new Producto("Panel solar","reciclables",35000,false);
		Producto compostera = new Producto("Compostera","algo",8000,true);
		Orden ordenDeCompra = new OrdenCompra("1",0);
		ordenDeCompra.agregarProducto(compostera);
		ordenDeCompra.agregarProducto(panel);
		
		Producto calefon = new Producto("calefon solar","reciclables",50000,false);
		Tecnico tecnico = new Tecnico("Lucia Iraola","instalaciones solares",4500);
		OrdenServicio ordenDeServicio = new OrdenServicio("Larrea 5800, Mar del Plata", 5, "algo");
		ordenDeServicio.agregarProducto(calefon);
		ordenDeServicio.agregarTecnico(tecnico);
		assertEquals(43000,ordenDeCompra.calcularCosto());
		assertEquals(72500,ordenDeServicio.calcularCosto());
	}
	@Test
	void descuentoTest() {
		Producto panel1 = new Producto("Panel solar","reciclables",1000,false);
		Orden ordenDeCompra = new OrdenCompra("1",0);
		ordenDeCompra.agregarProducto(panel1);
		ordenDeCompra.agregarProducto(panel1);
		ordenDeCompra.agregarProducto(panel1);
		ordenDeCompra.agregarProducto(panel1);
		ordenDeCompra.agregarProducto(panel1);
		assertEquals(4500,ordenDeCompra.calcularCosto());
		
	}
	@Test
	void agregarOrdenesTest() {
		Producto panel = new Producto("Panel solar","reciclables",35000,false);
		Producto compostera = new Producto("Compostera","algo",8000,true);
		Orden ordenDeCompra = new OrdenCompra("1",0);
		ordenDeCompra.agregarProducto(compostera);
		ordenDeCompra.agregarProducto(panel);
		usuario.agregarOrden(ordenDeCompra);
		Producto calefon = new Producto("calefon solar","reciclables",50000,false);
		Tecnico tecnico = new Tecnico("Lucia Iraola","instalaciones solares",4500);
		OrdenServicio ordenDeServicio = new OrdenServicio("Larrea 5800, Mar del Plata", 5, "algo");
		ordenDeServicio.agregarProducto(calefon);
		ordenDeServicio.agregarTecnico(tecnico);
		usuario.agregarOrden(ordenDeServicio);
		assertEquals(2,usuario.getOrdenes().size());
	}
	
	
}
