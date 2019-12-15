package ejercicio9.poo;

public class Espectador {

	private String nombre;
	private int edad;
	private double dineroQueTiene;
	private boolean sentado;
	
	

	public boolean isSentado() {
		return sentado;
	}

	public void setSentado(boolean sentado) {
		this.sentado = sentado;
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

	public double getDineroQueTiene() {
		return dineroQueTiene;
	}

	public void setDineroQueTiene(double dineroQueTiene) {
		this.dineroQueTiene = dineroQueTiene;
	}

	public Espectador(String nombre, int edad, float dineroQueTiene) {
		this.nombre = nombre;
		this.edad = edad;
		this.dineroQueTiene = dineroQueTiene;
		this.sentado = false;
	}

	public boolean tieneDineroSuficiente() {

		return (getDineroQueTiene() >= Cine.getPrecio());

	}
	
	public boolean tieneLaEdadSuficiente(Pelicula pelicula) {
		return (getEdad() >= pelicula.getEdadMinima());
	}

	@Override
	public String toString() {
		return " ESPECTADOR: " + getNombre() + ", " + getEdad() + " años, tiene: "
				+ getDineroQueTiene() + " euros";
	}

}
