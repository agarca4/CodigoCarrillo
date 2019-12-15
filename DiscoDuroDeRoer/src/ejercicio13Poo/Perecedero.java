package ejercicio13Poo;

public class Perecedero extends Producto {

	private int diasACaducar;

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	public Perecedero() {
		super();
 
	}

	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	@Override
	public double calcular(int cantidadDeProductos) {
		double precioTotal;
		if (getDiasACaducar() == 1) {
			precioTotal = super.calcular(cantidadDeProductos) / 4;
		} else if (getDiasACaducar() == 2) {
			precioTotal = super.calcular(cantidadDeProductos) / 3;
		} else if (getDiasACaducar() == 3) {
			precioTotal = super.calcular(cantidadDeProductos) / 2;
		} else {
			precioTotal = super.calcular(cantidadDeProductos);
		}

		return precioTotal;
	}

	@Override
	public String toString() {
		return "Perecedero [getDiasACaducar()=" + getDiasACaducar() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

}
