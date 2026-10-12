package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;

public interface Lapse {
	
	public LocalDate getFrom();

	public LocalDate getTo();
	
	public int sizeInDays();

	public boolean includesDate(LocalDate other);
	
}
