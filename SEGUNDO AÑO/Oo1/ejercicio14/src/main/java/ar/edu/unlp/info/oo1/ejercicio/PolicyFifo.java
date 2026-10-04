package ar.edu.unlp.info.oo1.ejercicio;

import java.util.List;

public class PolicyFifo extends Policy{

	public PolicyFifo(String nombre) {
		super(nombre);
		
	}

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(0);
	}
	
}
