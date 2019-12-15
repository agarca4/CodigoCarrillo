package ejercicio12BisPoo;

public class Repartidor extends Empleado implements Plus{
	
	private String zona;

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public Repartidor() {
		super();
	}
	

	public Repartidor(String nombre, int edad, int salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	@Override
	public void plus() {
		if (getEdad() < 25 && getZona().equals("zona 3")) {
			System.out.println("El repartidor recibirá el Plus de " + PLUS +"€");
			setSalario(getSalario() + PLUS);
		}
	}
	

	@Override
	public String toString() {
		return "Repartidor [getZona()=" + getZona() + ", toString()=" + super.toString();
	}
	
	
	
	

}
