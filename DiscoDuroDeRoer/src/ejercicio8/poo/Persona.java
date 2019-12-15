package ejercicio8.poo;

public abstract class Persona {

	private String nombre;
	private int edad;
	private char sexo;
	private boolean asistencia;

	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Persona() {
		int s = MetodosSueltos.generaNumeroAleatorio(0, 1);
		if (s == 0) {
			setSexo('H');
		} else {
			setSexo('M');
		}

		disponibilidad();
	}

	public abstract void disponibilidad();

}
