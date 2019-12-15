package ejercicio8.poo;

public class Estudiante extends Persona {

	private int nota;

	public int getCalificacion() {
		return nota;
	}

	public void setCalificacion(int calificacion) {
		this.nota = calificacion;
	}

	public Estudiante() {
		super();
		this.nota = MetodosSueltos.generaNumeroAleatorio(0, 10);

	}

	@Override
	public void disponibilidad() {

		int numero = MetodosSueltos.generaNumeroAleatorio(0, 100);
		if (numero <= 50) {
			super.setAsistencia(true);
		} else {
			super.setAsistencia(false);
		}

	}

	@Override
	public String toString() {
		return "Estudiante [getCalificacion()=" + getCalificacion() + ", isAsistencia()=" + isAsistencia()
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + "]";
	}



}
