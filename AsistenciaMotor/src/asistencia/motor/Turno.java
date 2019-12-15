package asistencia.motor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Turno {

	private static int turnoAdar;
	private static int valorEnteroDelTurnoAlQueLeToca = 1;

	private static int getValorEnteroDelTurnoAlQueLeToca() {
		return valorEnteroDelTurnoAlQueLeToca;
	}

	private static void setValorEnteroDelTurnoAlQueLeToca(int valorEnteroDelTurnoAlQueLeToca) {
		Turno.valorEnteroDelTurnoAlQueLeToca = valorEnteroDelTurnoAlQueLeToca;
	}

	private static int getTurnoAdar() {
		return turnoAdar;
	}

	private static void setTurnoAdar(int turnoAdar) {
		Turno.turnoAdar = turnoAdar;
	}

	public static void verTurnoActual() {
		System.out.println("\n El turno actual es: " + getValorEnteroDelTurnoAlQueLeToca() + "\n");
	}

	public static void pasarTurno() {
		setValorEnteroDelTurnoAlQueLeToca(getValorEnteroDelTurnoAlQueLeToca() + 1);
		System.out.println("\nSe ha pasado turno\n");
	}

	public static void darTurno(ArrayList<Vehiculo> vehiculosIngresados) {
		
		System.out.println("Se va a dar turno a los vehiculos ingresados en el taller: \n");

		for (int i = 0; i < vehiculosIngresados.size(); i++) {
			vehiculosIngresados.get(i).setPuntosParaTurno(puntosParaTurno(vehiculosIngresados.get(i)));
		}
		for (int j = 0; j < vehiculosIngresados.size(); j++) {

			Collections.sort(vehiculosIngresados, Comparator.comparing(Vehiculo::getPuntosParaTurno));

		}

		for (int j = 0; j < vehiculosIngresados.size(); j++) {
			vehiculosIngresados.get(j).setValorDelTurnoAsignado(getTurnoAdar() + 1);
			setTurnoAdar(getTurnoAdar() + 1);
		}
		
		for (int i = 0; i < vehiculosIngresados.size(); i++) {
			System.out.println("El vehiculo: " + vehiculosIngresados.get(i) + " tiene el TURNO: " + vehiculosIngresados.get(i).getValorDelTurnoAsignado());
			
		}

	}

	public static int puntosParaTurno(Vehiculo vehiculo) {
		int puntos = 50;
		vehiculo.setPiezasDisponibles(false);
		int n = MetodosSueltos.generaNumeroAleatorio(0, 1);
		if (n == 1) {
			vehiculo.setPiezasDisponibles(true);
			puntos = 0;
		}
		int horasDeTrabajo = 0;
		for (int i = 0; i < vehiculo.averias.length && vehiculo.averias[i] != null; i++) {

			horasDeTrabajo += vehiculo.averias[i].getHorasTrabajoNecesarias();

		}
		if (horasDeTrabajo <= 2) {
			puntos += 10;
		} else if (horasDeTrabajo > 2 && horasDeTrabajo <= 10) {
			puntos += 20;
		} else {
			puntos += 30;
		}
		Calendar calendar = Calendar.getInstance();
		if (vehiculo.getFechaDeIngresoEnTaller().compareTo(calendar.getTime()) > 7) {
			puntos += 20;

		} else if (vehiculo.getFechaDeIngresoEnTaller().compareTo(calendar.getTime()) > 3
				&& vehiculo.getFechaDeIngresoEnTaller().compareTo(calendar.getTime()) <= 7) {
			puntos += 30;

		} else {
			puntos += 40;
		}

		return puntos;
	}

	@Override
	public String toString() {
		return "Turno [turnoAdar=" + turnoAdar + ", getTurnoAdar()=" + getTurnoAdar() + "]";
	}

}
