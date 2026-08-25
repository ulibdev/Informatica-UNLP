package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal= 0.0;
		this.pesoTotal = 0.0;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0.0;
		this.pesoTotal = 0.0;
	}
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos+=1;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public Ticket emitirTicket() {
		return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
	}
	
}
