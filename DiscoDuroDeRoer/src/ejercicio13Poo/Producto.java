package ejercicio13Poo;

public class Producto implements Calculable {

	private String nombre;
	private double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto() {

	}

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public double calcular(int cantidadDeProductos) {
		double precioTotal = getPrecio() * cantidadDeProductos;
		return precioTotal;

	}

	@Override
	public String toString() {
		return "Producto [getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}

}
