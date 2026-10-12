package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapseWithSizeInDays implements Lapse{

	private LocalDate from;
	private int sizeInDays;
	
	public DataLapseWithSizeInDays(LocalDate from, LocalDate to) {
		this.from = from;
		if(from == null || to == null) {
			this.sizeInDays = 0;
		}else this.sizeInDays = (int) ChronoUnit.DAYS.between(from, to);
		
	}
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.getFrom().plusDays(sizeInDays);
	}
	

	public int sizeInDays() {
		return this.sizeInDays;
		
	}

	public boolean includesDate(LocalDate other) {
		if (other == null || from == null) {
            return false;
        }
		LocalDate to = this.getFrom().plusDays(sizeInDays);
		return other.isAfter(from) && other.isBefore(to);
	}
}
