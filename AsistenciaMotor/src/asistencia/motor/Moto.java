package asistencia.motor;

public class Moto extends VehiculoConRuedas {

	
	
	
	public Moto(String color, String modelo) {
		super(color, modelo);
		
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	@Override
	public String toString() {
		return "Moto " + super.toString();
	}
	
	

}
