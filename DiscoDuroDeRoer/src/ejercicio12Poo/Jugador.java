package ejercicio12Poo;

public class Jugador {

	

	private int id;
	private String nombre;
	private boolean vivo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isVivo() {
		return vivo;
	}

	public Jugador(int id) {
	
		this.id = id;
		this.nombre = "Jugador " + id;
		this.vivo = true;
	}

	public void disparar(Revolver r) {
		System.out.println("El " + nombre + " se apunta con la pistola y dispara");
		if (r.disparar()) {
			vivo = false;
			System.out.println("El " + nombre + " ha muerto");
		} else {
			System.out.println("El " + nombre + " sigue vivo");
		}
	}

}
