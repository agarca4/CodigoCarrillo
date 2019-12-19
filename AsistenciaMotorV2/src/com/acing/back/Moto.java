package com.acing.back;

public class Moto extends VehiculoConRuedas {

	private int numeroDeRuedas;

	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public Moto(String modelo, String color) {
		super(modelo, color);
		setNumeroDeRuedas(getNumeroDeRuedas());

	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString() + " con " + getNumeroDeRuedas() + " ruedas";
	}

	

}
