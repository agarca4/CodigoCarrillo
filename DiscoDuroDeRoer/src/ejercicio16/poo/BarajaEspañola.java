package ejercicio16.poo;

public class BarajaEspañola extends Baraja {

	private boolean incluye_8_9;

	public BarajaEspañola(boolean incluye_8_9) {
		super();

		this.incluye_8_9 = incluye_8_9;

		if (incluye_8_9) {
			setNumCartas(48);
			setCartasPorPalo(12);
		} else {
			setNumCartas(40);
			setCartasPorPalo(10);
		}

		crearBaraja(); // Creamos la baraja
		super.barajar(); // barajamos la baraja
	}

	@Override
	public void crearBaraja() {

		setCartas((Carta<PalosBarajaEspañola>[]) new Carta[getNumCartas()]);

		PalosBarajaEspañola[] palos = PalosBarajaEspañola.values();

		// Recorro los palos
		for (int i = 0; i < palos.length; i++) {

			// Recorro los numeros
			for (int j = 0; j < getCartasPorPalo(); j++) {
				if (incluye_8_9) {
					getCartas()[((i * getCartasPorPalo()) + j)] = new Carta(j + 1, palos[i]);
				} else { // Las posiciones del 8 y del 9 son el 7 y el 8 (emepzamos en 8)

					if (j >= 7) {

						// Solo para la sota, caballo y rey
						getCartas()[((i * getCartasPorPalo()) + j)] = new Carta(j + 3, palos[i]);
					} else {
						// Para los casos de 1 a 7
						getCartas()[((i * getCartasPorPalo()) + j)] = new Carta(j + 1, palos[i]);
					}
				}

			}

		}

	}
}