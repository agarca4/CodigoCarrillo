package ejercicio15Poo;

public class Contacto {
	
	private String nombre;
	private int telefono;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Nombre: " + getNombre()
				+ ", Telefono: " + getTelefono();
	}
	
	 
	
	
	
	

}
