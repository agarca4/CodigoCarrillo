package ejercicio10.poo;

import java.util.Arrays;
import java.util.Objects;

public class Baraja {

	public static final int TAMANO_BARAJA = 40;

	private Carta[] cartas;
	private Carta[] cartasRepartidas;

	public Carta[] getCartasRepartidas() {
		return cartasRepartidas;
	}

	public void setCartasRepartidas(Carta[] cartasRepartidas) {
		this.cartasRepartidas = cartasRepartidas;
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	public Baraja() {
		this.cartas = new Carta[TAMANO_BARAJA];
		this.cartasRepartidas = new Carta[TAMANO_BARAJA];
		int j = 0;
		for (int i = 0; i < cartas.length; i++) {
			cartas[i] = new Carta();
		}

		for (int i = 0; i < 10; i++) {
			cartas[i].setNumero(Carta.NUMEROS[i]);
			cartas[i].setPalo(Carta.PALOS[0]);
		}
		for (int i = 10; i < 20; i++) {

			cartas[i].setNumero(Carta.NUMEROS[j]);
			cartas[i].setPalo(Carta.PALOS[1]);
			j++;
		}
		j = 0;
		for (int i = 20; i < 30; i++) {

			cartas[i].setNumero(Carta.NUMEROS[j]);
			cartas[i].setPalo(Carta.PALOS[2]);
			j++;
		}
		j = 0;
		for (int i = 30; i < 40; i++) {

			cartas[i].setNumero(Carta.NUMEROS[j]);
			cartas[i].setPalo(Carta.PALOS[3]);
			j++;
		}

	}

	public void barajar() {

		Carta cartaAux;

		for (int i = 0; i < Baraja.TAMANO_BARAJA; i++) {
			int posicionAleatoria = MetodosSueltos.generaNumeroAleatorio(0, 39);
			cartaAux = getCartas()[i];
			getCartas()[i] = getCartas()[posicionAleatoria];
			getCartas()[posicionAleatoria] = cartaAux;
		}
	}

	public Carta siguienteCarta(Carta carta) {

		for (int i = 0; i < getCartas().length - 1; i++) {
			if (getCartas()[i].equals(carta)) {
				carta = getCartas()[i + 1];
				return carta;
			}
		}
		System.out.println("No hay carta siguiente a la suya");
		return carta;

	}

	public Carta[] repartir(int cuantasCartasReparto) {

		int contador = 0;

		if (cartasDisponibles() >= cuantasCartasReparto) {
			for (int i = 0; i < getCartas().length; i++) {
				if (!(Objects.equals(getCartas()[i], null)) & (Objects.equals(getCartasRepartidas()[i], null))
						& contador < cuantasCartasReparto) {

					getCartasRepartidas()[i] = getCartas()[i];
					getCartas()[i] = null;
					contador++;

				}

			}

		} else {
			System.out.println("No hay suficientes cartas para repartir");
		}
		return getCartasRepartidas();
	}

	public int cartasDisponibles() {
		int contador = 0;
		for (int i = 0; i < getCartas().length; i++) {
			if (!(Objects.equals(getCartas()[i], null))) {
				contador++;
			}
		}

		return contador;

	}

	public Carta[] cartasMonton() {
		if (cartasDisponibles() == TAMANO_BARAJA) {
			System.out.println("Aun no se ha repartido ninguna carta");
		}
		return getCartasRepartidas();
	}
	
	public Carta[] mostrarBaraja() {
		return getCartas();
		
	}

	@Override
	public String toString() {
		return "Baraja: " + Arrays.toString(getCartas());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cartas);
		result = prime * result + Arrays.hashCode(cartasRepartidas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baraja other = (Baraja) obj;
		if (!Arrays.equals(cartas, other.cartas))
			return false;
		if (!Arrays.equals(cartasRepartidas, other.cartasRepartidas))
			return false;
		return true;
	}
}
