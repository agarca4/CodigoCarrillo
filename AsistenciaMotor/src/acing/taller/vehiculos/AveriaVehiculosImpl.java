package acing.taller.vehiculos;

public class AveriaVehiculosImpl {

	private String nombreAveriaVehiculos;
	private int numeroHoras;
	private int numeroPiezas;

	protected String getNombreAveriaVehiculos() {
		return nombreAveriaVehiculos;
	}

	protected int getNumeroHoras() {
		return numeroHoras;
	}

	protected int getNumeroPiezas() {
		return numeroPiezas;
	}

	public AveriaVehiculosImpl(String nombreAveriaVehiculos, int numeroHoras, int numeroPiezas) {
		super();
		this.nombreAveriaVehiculos = nombreAveriaVehiculos;
		this.numeroHoras = numeroHoras;
		this.numeroPiezas = numeroPiezas;
	}

	@Override
	public String toString() {
		return  getNombreAveriaVehiculos() + ", necesita " + getNumeroHoras()
				+ " horas para ser reparada y " + getNumeroPiezas() + " piezas.\n";
	}

}
