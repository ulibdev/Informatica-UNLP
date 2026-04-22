package tp3.ej4;

public class AreaEmpresa {
	private String nombre;
	private double transmision = 0;
		public AreaEmpresa(String nombre,double t) {
			this.transmision = t;
			this.nombre = nombre;
		}
		public double getTransmision() {
			return this.transmision;
		}
		public String getNombre() {
			return this.nombre;
		}
}
