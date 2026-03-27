package tp1.ej3;

public class Test {

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[2];
		Profesor [] profesores = new Profesor[3];
		
		for (int i = 0; i<=1;i++) {
			estudiantes[i] = new Estudiante("hola","hola","hola","hola","hola");
			System.out.println(estudiantes[i].tusDatos());
		}
		for (int i = 0; i<=2;i++) {
			profesores[i] = new Profesor("adios","adios","adios","adios","adios");
			System.out.println(profesores[i].tusDatos());
		}

	}

}
