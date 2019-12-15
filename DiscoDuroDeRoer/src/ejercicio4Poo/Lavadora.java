package ejercicio4Poo;

public class Lavadora extends Electrodomestico {

	// Constantes
	private static final double CARGA_DEF = 5.0;

	// Atributos
	private double carga;

	// Constructores
	public Lavadora() {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF, CARGA_DEF);

	}

	public Lavadora(double precio, double peso) {
		this(precio, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso, CARGA_DEF);

	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double plusLavadora = 0;
		if (this.carga > 30) {
			plusLavadora = 50;
		}
		return super.precioFinal() + plusLavadora;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	

}
