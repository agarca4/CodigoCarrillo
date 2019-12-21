package acing.taller.vehiculos;

import acing.comun.Averia;
import acing.comun.Averiable;
import acing.comun.Presupuestable;
import acing.vehiculos.Vehiculo;

public class PresupuestoImpl implements Presupuestable<Averiable<VehiculoIngresadoImpl>> {

	public static final int PRECIO_HORA = 50;
	public static final int PRECIO_PIEZA = 10;

	private double precioTotal;

	protected double getPrecioTotal() {
		return precioTotal;
	}

	protected void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public double calcularPresupuesto(Averiable<VehiculoIngresadoImpl> Objeto) {
		if (((VehiculoIngresadoImpl) Objeto).getAverias() != null) {
			double precioPorHorasTrabajadas = 0;
			double precioPorPiezasUsadas = 0;

			for (Averia<AveriaImpl> averia : ((VehiculoIngresadoImpl) Objeto).getAverias()) {
				precioPorHorasTrabajadas += averia.getNumeroHoras() * PRECIO_HORA;
				precioPorPiezasUsadas += averia.getNumeroPiezas() * PRECIO_PIEZA;
			}
			setPrecioTotal(precioPorPiezasUsadas + precioPorHorasTrabajadas);
			System.err.println("El presupuesto para reparar su vehiculo es " + getPrecioTotal() + "€ \n");
		} else {
			setPrecioTotal(0.0);
			System.out.println("Su vehiculo no necesita ser presupuestado\n");
		}

		return getPrecioTotal();
	}

}
