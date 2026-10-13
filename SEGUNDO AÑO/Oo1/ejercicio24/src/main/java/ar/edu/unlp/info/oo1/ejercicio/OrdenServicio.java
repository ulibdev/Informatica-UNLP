package ar.edu.unlp.info.oo1.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class OrdenServicio extends Orden{
	private int horas;
	private String descripcion;
	private List<Tecnico> tecnicos;
	public OrdenServicio(String domicilio, int horas, String descripcion) {
		super(domicilio);
		this.horas = horas;
		this.descripcion = descripcion;
		this.tecnicos = new ArrayList<Tecnico>();
	}
	
	@Override
	public double calcularCosto() {
		double costo = this.getProductos().stream().mapToDouble(p -> p.getCosto()).sum() + 
				(this.getTecnicos().stream().mapToDouble(t -> t.getValorPorHora()).sum() *
				this.getHoras());
		if(this.getHoras() > 10)return costo * 0.90;
		else return costo;
	}

	public int getHoras() {
		return horas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}
	
	public void agregarTecnico(Tecnico tecnico) {
		this.tecnicos.add(tecnico);
	}
	
	
	
	

}
