package asistencia.motor;

public abstract class VehiculoConRuedas extends Vehiculo {

	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String color) {
		super(color);
	}

	public VehiculoConRuedas(String color, String modelo) {
		super(color, modelo);
	}
	
	public abstract int getNumeroDeRuedas();

	@Override
	public String toString() {
		return "con " + getNumeroDeRuedas() + " ruedas, " + super.toString();
	}


	
	

}