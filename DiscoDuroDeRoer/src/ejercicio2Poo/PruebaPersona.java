package ejercicio2Poo;



public class PruebaPersona {
	public static void main(String[] args) {


		Persona persona1 = new Persona("Mari", 33, 'M', 60.0, 1.63);
		Persona persona2 = new Persona("Palomo", 36, 'H');
		Persona persona3 = new Persona();

		persona3.setNombre("Antonio");
		persona3.setEdad(34);
		persona3.setSexo('H');
		persona3.setPeso(65.0);
		persona3.setAltura(1.75);

		persona2.setPeso(90.0);
		persona2.setAltura(1.80);

		System.out.println(persona1);
		mensajePeso(persona1);
		mensajeEdad(persona1);
		System.out.println("\n");

		System.out.println(persona2);
		mensajePeso(persona2);
		mensajeEdad(persona2);
		System.out.println("\n");

		System.out.println(persona3);
		mensajePeso(persona3);
		mensajeEdad(persona3);

	}

	public static void mensajePeso(Persona p) {
		int IMC = p.calcularIMC();
		if (IMC == Persona.PESO_IDEAL) {
			System.out.println(p.getNombre() + " Esta en su peso ideal");
		} else if (IMC == Persona.INFRAPESO) {
			System.out.println(p.getNombre() + " Esta por debajo de su peso ideal");
		} else {
			System.out.println(p.getNombre() + " Esta por encima de su peso ideal");
		}

	}

	public static void mensajeEdad(Persona p) {
		if (p.esMayorDeEdad()) {
			System.out.println(p.getNombre() + " Es mayor de edad");
		} else {
			System.out.println(p.getNombre() + " Es menor de edad");
		}
	}

}
