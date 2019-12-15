package ejercicio12BisPoo;

public class Comercial extends Empleado implements Plus{

	private double comision;

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Comercial() {
		super();
	}

	public Comercial(String nombre, int edad, int salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Comercial [getComision()=" + getComision() + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void plus() {	
		if(getEdad() > 30 && getComision() > 200 ) {
			System.out.println("El comercial recibira el Plus de " + PLUS + "€");
			setSalario(getSalario() + PLUS);
		}
		
	}

}
