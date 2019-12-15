package ejercicio4Poo;

public class Television extends Electrodomestico {

	// Constantes
	private final static int RESOLUCION_DEF = 20;
	private final static boolean SINTONIZADOR_DEF = false;

	// Atributos
	private int resolucion;
	private boolean sintonizador;

	// Constructores
	public Television() {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF, RESOLUCION_DEF, SINTONIZADOR_DEF);
	}

	public Television(double precioBase, double peso) {
		this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso, RESOLUCION_DEF, SINTONIZADOR_DEF);

	}

	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	// Metodos

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	@Override
	public double precioFinal() {
		double plusResolucion = 0;
		int plusSintonizador = 0;
		if (this.resolucion > 40) {
			plusResolucion = (super.precioFinal() * 30 / 100);
		}
		if (this.sintonizador) {
			plusSintonizador = 50;
		}

		return super.precioFinal() + plusResolucion + plusSintonizador;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precioBase=" + precioBase
				+ ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	

}
