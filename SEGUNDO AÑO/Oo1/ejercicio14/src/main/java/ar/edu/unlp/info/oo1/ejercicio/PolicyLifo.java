package ar.edu.unlp.info.oo1.ejercicio;

import java.util.List;

public class PolicyLifo extends Policy{

	public PolicyLifo(String nombre) {
		super(nombre);
		
	}

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}
	
}
