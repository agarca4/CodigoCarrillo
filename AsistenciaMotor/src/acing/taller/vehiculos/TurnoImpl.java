package acing.taller.vehiculos;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import acing.comun.Turno;

public class TurnoImpl implements Turno {

	@Override
	public void ordenarParaTurno(Object ordenables) {
		Collections.sort(((List<VehiculoIngresadoImpl>) ordenables), new Comparator<VehiculoIngresadoImpl>() {
			public int compare(VehiculoIngresadoImpl ob1, VehiculoIngresadoImpl ob2) {

				return ((VehiculoIngresadoImpl) ob1).getTiempoReparación()
						- ((VehiculoIngresadoImpl) ob2).getTiempoReparación();

			}
		});

	}

	public void ordenarPorTiempoReparacion(Object ordenables) {
	}
}
