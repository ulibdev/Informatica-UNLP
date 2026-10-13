package ar.edu.unlp.info.oo1.ejercicio;

public class OrdenCompra extends Orden{
	private double precioEnvio;

	public OrdenCompra(String domicilio, double precioEnvio) {
		super(domicilio);
		this.precioEnvio = precioEnvio;
	}

	@Override
	public double calcularCosto() {
		double costo =this.getProductos().stream().mapToDouble(p -> p.getCosto()).sum();
		if(this.getProductos().size() >= 5)return costo * 0.90;
		else return costo;
	}

	public double getPrecioEnvio() {
		return precioEnvio;
	}
	
	
	
}
