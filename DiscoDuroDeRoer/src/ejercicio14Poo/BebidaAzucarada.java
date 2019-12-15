package ejercicio14Poo;

public class BebidaAzucarada extends Producto {

	public static final double DESCUENTO = 0.1;

	private int porcentajeAzucar;
	private boolean promocion;

	public int getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(int porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	public BebidaAzucarada(int id, int cantidadLitros, double precio, String marca, int porcentajeAzucar,
			boolean promocion) {
		super(id, cantidadLitros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
		if (promocion) {
			setPrecio(precio - DESCUENTO * precio);
		}

	}

	@Override
	public String toString() {
		return "BebidaAzucarada [getPorcentajeAzucar()=" + getPorcentajeAzucar() + ", isPromocion()=" + isPromocion()
				+ ", toString()=" + super.toString();
	}

}
