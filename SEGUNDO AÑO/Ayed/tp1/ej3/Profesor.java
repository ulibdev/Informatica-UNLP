package tp1.ej3;

public class Profesor extends Usuario{
	
	private String catedra,facultad;

	public Profesor(String nombre,String apellido, String email,String catedra, String facultad) {
		super(nombre,apellido,email);
		this.setCatedra(catedra);
		this.setFacultad(facultad);
		
	}
	

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String tusDatos() {
		String aux = super.tusDatos() + "," + this.getCatedra() + "," + this.getFacultad() + ".";
		return aux;
	}
}
