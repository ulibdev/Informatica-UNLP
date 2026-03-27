package tp1.ej3;

public abstract class Usuario {
	private String nombre,apellido,email;
	
	public Usuario(String nombre,String apellido, String email) {
		this.setApellido(apellido);
		this.setEmail(email);
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String tusDatos() {
		String aux = this.getNombre() + "," + this.getApellido() + "," + this.getEmail();
		return aux;
	}
	
	
}
