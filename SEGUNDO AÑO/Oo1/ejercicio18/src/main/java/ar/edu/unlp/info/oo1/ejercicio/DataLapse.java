package ar.edu.unlp.info.oo1.ejercicio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse {

	private LocalDate from;
	private LocalDate to;
	
	public DataLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		if(from == null || to == null) {
			return 0;
		}else return (int) ChronoUnit.DAYS.between(from,to);
		
	}

	public boolean includesDate(LocalDate other) {
		if (other == null || from == null || to == null) {
            return false;
        }
		return other.isAfter(from) && other.isBefore(to);
	}
}
