package ar.edu.unlp.info.oo1.ejercicio;

import java.util.List;

public class PolicyHighestPriority extends Policy{

	public PolicyHighestPriority(String nombre) {
		super(nombre);
		
	}

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
	}
	
}
