package ar.edu.unlp.objetos.uno.ejercicio10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Farola {
	private boolean prendido;
	
	private List<Farola> vecinas;
	
	public Farola() {
		this.prendido = false;
		vecinas = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!vecinas.contains(otraFarola)) {
			vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	public void turnOn() {
		if(this.isOff()) {
			this.prendido = true;
			Iterator<Farola> it = this.getNeighbors().iterator();
			while(it.hasNext()) {
				it.next().turnOn();
			}
		}
	}
	public void turnOff() {
		if(this.isOn()) {
			this.prendido = false;
			Iterator<Farola> it = this.getNeighbors().iterator();
			while(it.hasNext()) {
				it.next().turnOff();
			}
		}
	}
	
	
	public boolean isOn() {
		return this.prendido;
	}
	public boolean isOff() {
		return !this.prendido;
	}
	
	
}
