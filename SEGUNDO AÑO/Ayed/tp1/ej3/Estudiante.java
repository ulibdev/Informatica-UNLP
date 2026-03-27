package tp1.ej3;

public class Estudiante extends Usuario{

	private String direccion,comision;

	
	
	public Estudiante(String nombre, String apellido, String email, String direccion, String comision) {
		super(nombre,apellido,email);
		this.direccion = direccion;
		this.comision = comision;
	}

	

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}
	
	@Override
	public String tusDatos() {
		String aux = super.tusDatos() + "," + this.getDireccion() + "," + this.getComision() + ".";
		return aux;
	}
}
