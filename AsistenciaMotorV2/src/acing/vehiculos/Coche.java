package acing.vehiculos;

public class Coche extends VehiculoConRuedas {

	private int numeroDeRuedas;
	private String matricula;

	void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public Coche(String modelo, String color, String matricula) {
		super(modelo, color);
		this.matricula = matricula;
		setNumeroDeRuedas(getNumeroDeRuedas());
	}



	@Override
	public int getNumeroDeRuedas() {
		return 4;
	}

	@Override
	public String toString() {
		return "Coche: " + super.toString() + " con placa " + getMatricula() + " y " + getNumeroDeRuedas() + " ruedas \n";
	}

}
