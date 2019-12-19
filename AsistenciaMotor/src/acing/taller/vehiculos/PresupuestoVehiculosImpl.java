package acing.taller.vehiculos;

import acing.comun.Averiable;
import acing.comun.Presupuestable;
import acing.vehiculos.Vehiculo;

public class PresupuestoVehiculosImpl implements Presupuestable<Averiable<Vehiculo>>{

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
	public double calcularPresupuesto(Averiable<Vehiculo> v1) {
		if (((Vehiculo) v1).getAverias() != null) {
			double precioPorHorasTrabajadas = 0;
			double precioPorPiezasUsadas = 0;

			for (AveriaVehiculosImpl averia : ((Vehiculo) v1).getAverias()) {
				precioPorHorasTrabajadas += averia.getNumeroHoras() * PRECIO_HORA;
				precioPorPiezasUsadas += averia.getNumeroPiezas() * PRECIO_PIEZA;
			}
			setPrecioTotal(precioPorPiezasUsadas + precioPorHorasTrabajadas);
			System.err.println("El presupuesto para reparar su vehiculo es " + getPrecioTotal() + "€ \n");
		}else {
			setPrecioTotal(0.0);
			System.out.println("Su vehiculo no necesita ser presupuestado\n");
		}

		
		return getPrecioTotal();
	}



	


	

}
