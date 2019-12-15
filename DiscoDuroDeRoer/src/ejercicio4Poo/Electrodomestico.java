package ejercicio4Poo;

public class Electrodomestico {

	// constantes
	public static final String COLOR_DEF = "blanco";
	public static final char CONSUMO_ENERGETICO_DEF = 'F';
	public static final double PRECIO_BASE_DEF = 100.0;
	public static final double PESO_DEF = 5.0;

	// atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// constructores
	public Electrodomestico() {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso);

	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Metodos
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
		boolean letraEncontrada = false;
		for (int i = 0; i < letras.length && !letraEncontrada; i++) {
			if (letras[i] == consumoEnergetico) {
				letraEncontrada = true;
			}
		}
		if (letraEncontrada) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		}

	}

	private void comprobarColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean colorEncontrado = false;
		for (int i = 0; i < colores.length && !colorEncontrado; i++) {
			if (colores[i].equals(color)) {
				colorEncontrado = true;
			}
		}
		if (colorEncontrado) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}

	}

	public double precioFinal() {
		int plus = 0;
		switch (this.consumoEnergetico) {
		case 'A':
			plus = 100;
			break;
		case 'B':
			plus = 80;
			break;
		case 'C':
			plus = 60;
			break;
		case 'D':
			plus = 50;
			break;
		case 'E':
			plus = 30;
			break;
		case 'F':
			plus = 10;
			break;
		}
		if (this.peso >= 0 && this.peso < 20) {
			plus += 10;
		} else if (this.peso >= 20 && this.peso < 50) {
			plus += 50;
		} else if (this.peso >= 50 && this.peso < 80) {
			plus += 80;
		} else {
			plus += 100;
		}

		return plus + this.precioBase;

	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
