package ejercicio10.poo;

import java.util.Arrays;
import java.util.Objects;

public class ClaseMain {
	public static void main(String[] args) {

		Baraja baraja1 = new Baraja();
//		Baraja baraja2 = new Baraja();

//		baraja1.getCartas()[15] = null;
//		baraja1.getCartas()[39] = null;
//		System.out.println(baraja1);
//		System.out.println(baraja1.cartasDisponibles());
		
		baraja1.repartir(10);
		System.out.println(Arrays.toString(baraja1.getCartas()));
		System.out.println(Arrays.toString(baraja1.getCartasRepartidas()));
		

		baraja1.cartasMonton();
		
		
		

//		System.out.println(baraja1);
//		System.out.println(baraja2);

//		baraja1.repartir(20);
//		System.out.println(baraja1);
//		baraja1.repartir(19);
//		System.out.println(baraja1);

//		System.out.println(baraja.getCartas()[2]);
//		
//		Carta carta1 = new Carta(11, "copas");
//		Carta carta2 = new Carta(11, "copas");
//		Carta carta3 = new Carta(1, "copas");
//		Carta cartaVacia = new Carta(0, null);
//		
//		System.out.println(Objects.equals(carta1, carta2));
//		System.out.println(Objects.deepEquals(carta1, carta2));
//		System.out.println(Objects.equals(carta1, carta3));
//		
//		System.out.println(carta1.equals(carta2));
//		System.out.println(carta1.equals(carta3));
//		
//		System.out.println(Objects.isNull(cartaVacia));

//		System.out.println(Objects.equals(baraja1, baraja2));
//		System.out.println(Objects.deepEquals(baraja1, baraja2));
//		System.out.println(baraja1.getCartas()[0]);
//		
//		System.out.println(Objects.equals(baraja1.getCartas(), baraja2.getCartas()));
//		System.out.println(Objects.deepEquals(baraja1.getCartas(), baraja2.getCartas()));
//		System.out.println(Arrays.equals(baraja1.getCartas(), baraja2.getCartas()));
//		System.out.println(Arrays.deepEquals(baraja1.getCartas(), baraja2.getCartas()));
//		
//		baraja1.getCartas()[0] = null;
//		System.out.println(baraja1.getCartas()[0]);
//		System.out.println(Objects.isNull(baraja1.getCartas()[0]));

//		
//		System.out.println(baraja.siguienteCarta(carta));

//		System.out.println(Arrays.toString(baraja.repartir(15)));
//		System.out.println(baraja);

//		System.out.println(Arrays.toString(baraja.repartir(1)));
//		System.out.println(baraja);

//		for (Carta cartas : baraja1.getCartasRepartidas()) {
//			System.out.println(cartas);
//		}
//		System.out.println(Objects.isNull(baraja1.getCartasRepartidas()));
//		System.out.println(Objects.isNull(baraja1.getCartasRepartidas()[0]));
//		
//		System.out.println(Objects.equals(baraja1.getCartasRepartidas(), baraja2.getCartasRepartidas()));
//		System.out.println(Objects.deepEquals(baraja1.getCartasRepartidas(), baraja2.getCartasRepartidas()));

//		System.out.println(Objects.equals(baraja1.getCartas(), baraja2.getCartas()));
//		System.out.println(Objects.deepEquals(baraja1.getCartas(), baraja2.getCartas()));
//		
//		System.out.println(Objects.equals(baraja1, baraja2));
//		System.out.println(Objects.deepEquals(baraja1, baraja2));

//		System.out.println(Arrays.equals(baraja1.getCartasRepartidas(), baraja2.getCartasRepartidas()));
//		System.out.println(Arrays.deepEquals(baraja1.getCartasRepartidas(), baraja2.getCartasRepartidas()));
//		
//		System.out.println(Objects.equals(baraja1.getCartasRepartidas(), null));
//		System.out.println(Objects.equals(baraja1.getCartasRepartidas()[0], null));
//		System.out.println(Objects.deepEquals(baraja1.getCartasRepartidas(), null));
//		System.out.println(Arrays.equals(baraja1.getCartasRepartidas(), null));
//		System.out.println(Arrays.deepEquals(baraja1.getCartasRepartidas(), null));

	}

}
