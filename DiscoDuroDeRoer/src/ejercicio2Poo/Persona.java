package ejercicio2Poo;

public class Persona {

	// Constantes

	private final static char SEXO_DEF = 'H';
	public final static int PESO_IDEAL = 0;
	public final static int SOBREPESO = 1;
	public final static int INFRAPESO = -1;

	// Atributos

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;

	// Contructores

	public Persona() {
		this("", 0, SEXO_DEF, 0, 0);
	}

	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0, 0);
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		generarDni();
		this.sexo = sexo;
		comprobarSexo();
	}

	// Metodos

	public int calcularIMC() {
		double IMC = this.peso / Math.pow(this.altura, 2);
		if (IMC < 20) {
			return INFRAPESO;

		} else {
			if (IMC >= 20 && IMC <= 25) {
				return PESO_IDEAL;
			}
		}
		return SOBREPESO;

	}
	
	

	public String getNombre() {
		return nombre;
	}

	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}

	private void comprobarSexo() {
		if (this.sexo != 'H' && this.sexo != 'M') {
			this.sexo = SEXO_DEF;

		}
	}

	private void generarDni() {
		final int divisor = 23;

		// Generamos un número de 8 digitos
		int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
		int res = numDNI - (numDNI / divisor * divisor);

		// Calculamos la letra del DNI
		char letraDNI = generaLetraDNI(res);

		// Pasamos el DNI a String
		DNI = Integer.toString(numDNI) + letraDNI;
	}

	private char generaLetraDNI(int res) {
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		return letras[res];
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	

}
