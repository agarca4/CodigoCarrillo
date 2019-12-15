package ejercicio8.poo;

import java.util.Arrays;

public class Aula {

	private final int CAPACIDAD_MAX = 10;

	private int id;
	private String asignaturaImpartida;
	private Estudiante[] estudiantes;
	private Profesor profesor;
//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsignaturaImpartida() {
		return asignaturaImpartida;
	}

	public void setAsignaturaImpartida(String asignaturaImpartida) {
		this.asignaturaImpartida = asignaturaImpartida;
	}

	public Aula(int id, String asignaturaImpartida) {
		this.estudiantes = new Estudiante[CAPACIDAD_MAX];
		for (int i = 0; i < estudiantes.length; i++) {
			estudiantes[i] = new Estudiante();
		}
		this.profesor = new Profesor();
		this.id = id;
		this.asignaturaImpartida = asignaturaImpartida;
	}

	public boolean isSeDaClase() {
		boolean hayClase = false;
		int contador = 0;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i].isAsistencia()) {
				contador++;
			}
			if (profesor.isAsistencia() == true && profesor.getMateria() == asignaturaImpartida && contador >= 5) {
				hayClase = true;
			}
		}
		return hayClase;
	}

	public void cuantosAlumnosAprobados() {
		int alumnosAprobados = 0;
		int alumnasAprobadas = 0;
		if (isSeDaClase()) {
			for (int i = 0; i < estudiantes.length; i++) {
				if (estudiantes[i].getCalificacion() >= 5 && estudiantes[i].getSexo() == 'H') {
					alumnosAprobados++;
				} else if (estudiantes[i].getCalificacion() >= 5 && estudiantes[i].getSexo() == 'M') {
					alumnasAprobadas++;
				}
			}
			System.out.println("El total de alumnOs aprobados es: " + alumnosAprobados + "\nEl total de "
					+ "alumAs aprobadas es: " + alumnasAprobadas);
		}

	}

	@Override
	public String toString() {
		return "Aula [estudiantes=" + Arrays.toString(estudiantes) + ", profesor=" + profesor + ", getId()=" + getId()
				+ ", getAsignaturaImpartida()=" + getAsignaturaImpartida() + "]";
	}

}
