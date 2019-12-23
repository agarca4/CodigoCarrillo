package acing.vehiculos;

public abstract class VehiculoConRuedas extends Vehiculo {

	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	public abstract int getNumeroDeRuedas();
}
