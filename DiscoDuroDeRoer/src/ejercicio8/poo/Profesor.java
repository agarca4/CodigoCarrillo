package ejercicio8.poo;

public class Profesor extends Persona {
	
	public final String[] MATERIAS = {"matematicas", "filosofia", "fisica"};
	
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public Profesor() {
		super();
		int n = MetodosSueltos.generaNumeroAleatorio(0, 2);
		if (n == 0) {
			this.materia = "matematicas";
		}else if (n == 1) {
			this.materia = "filosofia";
		}else {
			this.materia = "fisica";
		}
	}
	
	@Override
	public void disponibilidad() {
		
		int n = MetodosSueltos.generaNumeroAleatorio(0, 100);
		if (n > 20) {
			super.setAsistencia(true);
		}else {
			super.setAsistencia(false);
		}
		
		
	}

	@Override
	public String toString() {
		return "Profesor [getMateria()=" + getMateria() + ", isAsistencia()=" + isAsistencia() + ", getNombre()="
				+ getNombre() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + "]";
	}

	
	}
	
	
	
	
	


