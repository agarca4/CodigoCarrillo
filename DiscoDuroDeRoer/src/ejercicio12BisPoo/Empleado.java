package ejercicio12BisPoo;



public class Empleado{

	public static final int PLUS = 300;

	private String nombre;
	private int edad;
	private int salario;

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

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Empleado() {
	}

	public Empleado(String nombre, int edad, int salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario()
				+ "]";
	}
	
	

}
