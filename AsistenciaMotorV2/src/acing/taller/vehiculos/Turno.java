package acing.taller.vehiculos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import acing.comun.Averiable;

public class Turno {

	public static void ordenarVehiculosIngresados(List<Averiable> vehiculosIngresados) {
		Collections.sort(vehiculosIngresados, Turno.COMPARADOR);
	}

	public static final Comparator<Averiable> COMPARADOR = new Comparator<Averiable>() {

		@Override
		public int compare(Averiable o1, Averiable o2) {

			int valorComparacion = -Boolean.compare(o1.isPiezasDisponibles(), o2.isPiezasDisponibles());

			if (valorComparacion == 0) {
				valorComparacion = COMPARADOR_FECHA.compare(o1, o2);
				if (valorComparacion == 0) {
					valorComparacion = COMPARADOR_TIEMPO_REPARACION.compare(o1, o2);
				}
			}

			return valorComparacion;
		}

	};

	static Comparator<Averiable> COMPARADOR_FECHA = (o1, o2) -> o1.getFechaIngreso().compareTo(o2.getFechaIngreso());

	static Comparator<Averiable> COMPARADOR_TIEMPO_REPARACION = (o1, o2) -> Integer.compare(o1.getTiempoReparación(),
			o2.getTiempoReparación());

}
