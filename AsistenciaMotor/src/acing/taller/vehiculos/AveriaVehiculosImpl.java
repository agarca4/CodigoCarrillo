package acing.taller.vehiculos;

import acing.comun.Averia;

public class AveriaVehiculosImpl implements Averia<AveriaVehiculosImpl>{

	private String nombreAveriaVehiculos;
	private int numeroHoras;
	private int numeroPiezas;

	public String getNombre() {
		return nombreAveriaVehiculos;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public int getNumeroPiezas() {
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
		return  getNombre() + ", necesita " + getNumeroHoras()
				+ " horas para ser reparada y " + getNumeroPiezas() + " piezas.\n";
	}


}
