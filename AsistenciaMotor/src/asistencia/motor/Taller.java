package asistencia.motor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Taller {

	public static final int PRECIO_POR_HORA_DE_TRABAJO = 50;
	public static final int PRECIO_POR_PIEZA_DE_REPUESTO = 10;
	public static final int CAPACIDAD_MAXIMA_TALLER = 5;
	public static final int NUMERO_MAXIMO_DE_AVERIAS_POR_VEHICULO = 2;

	private static ArrayList<Vehiculo> vehiculosIngresados = new ArrayList<Vehiculo>();

	public static ArrayList<Vehiculo> getVehiculosIngresados() {
		return vehiculosIngresados;
	}

	public static void setVehiculosIngresados(ArrayList<Vehiculo> vehiculosIngresados) {
		Taller.vehiculosIngresados = vehiculosIngresados;
	}

	public static void ingresarVehiculo(Vehiculo vehiculoAIngresar) {
		if (getVehiculosIngresados().size() < CAPACIDAD_MAXIMA_TALLER) {
			vehiculosIngresados.add(vehiculoAIngresar);
			Calendar calendar = Calendar.getInstance();
			vehiculoAIngresar.setFechaDeIngresoEnTaller(calendar.getTime());
		}else {
			System.out.println("El taller está lleno");
		}
		System.out.println("INGRESADO: " + vehiculoAIngresar + "\n");

	}

	
	public static void diagnosticar(Vehiculo vehiculoIngresado) {

		int numeroDeAverias = MetodosSueltos.generaNumeroAleatorio(1, NUMERO_MAXIMO_DE_AVERIAS_POR_VEHICULO);
		Averia[] averias = new Averia[numeroDeAverias];
		for (int i = 0; i < numeroDeAverias; i++) {
			int tipoDeAveria = MetodosSueltos.generaNumeroAleatorio(0, Averia.CATALOGO_DE_AVERIAS.length);
			if (tipoDeAveria == 0) {
				averias[i] = new Averia(Averia.CATALOGO_DE_AVERIAS[0]);
			} else if (tipoDeAveria == 1) {
				averias[i] = new Averia(Averia.CATALOGO_DE_AVERIAS[1]);
			} else {
				averias[i] = new Averia(Averia.CATALOGO_DE_AVERIAS[2]);
			}
		}

		int presupuestoTotal = 0;
		int horasTotalTrabajo = 0;
		for (int i = 0; i < averias.length; i++) {
			presupuestoTotal += averias[i].getPresupuestoAveria();
			horasTotalTrabajo += averias[i].getHorasTrabajoNecesarias();

		}
		vehiculoIngresado.setAverias(averias);
		
		System.out.println("DIAGNOSTICO: " + vehiculoIngresado + " ,su reparacion llevará " + horasTotalTrabajo
				+ " horas, y " + "el presupuesto total en euros es: " + presupuestoTotal + "\n");
		
		// Con esto, mostramos las averias de cada vehiculo
		System.out.println("Las averias que tiene su vehiculo son: " + Arrays.toString(averias) + "\n");

	}

	// ademas de poner las averias del vehiculo a null, almacenará las averias
	// extraidas del diagnostico en un array averiasAntiguas, por si el cliente
	// vuelve antes de un año comparar si son las mismas
	
	public static void reparar(Vehiculo vehiculoAreparar) {

		Reparación reparación = new Reparación();
		vehiculoAreparar.setAveriasAntiguas(vehiculoAreparar.getAverias());
		vehiculoAreparar.setAverias(null);
		vehiculoAreparar.setFechaUltimaReparacion(reparación.getFechaDeReparacion());
		vehiculoAreparar.setFechaExpiracionGarantia(reparación.getFechaFinGarantia());
		
		// Una vez reparado lo sacamos del taller y borramos sus turnos
		getVehiculosIngresados().remove(vehiculoAreparar);
		vehiculoAreparar.setValorDelTurnoAsignado(0);
		vehiculoAreparar.setPuntosParaTurno(0);
		System.out.println("REPARACION: " + vehiculoAreparar + " ha sido reparado con fecha "
				+ vehiculoAreparar.getFechaUltimaReparacion() + " ,tiene garantia hasta "
				+ vehiculoAreparar.getFechaExpiracionGarantia()
				+ ". Actualmente las averias que presenta su vehiculo son: "
				+ Arrays.toString(vehiculoAreparar.getAverias()) + "\n");
	}

	// llama al metodo diagnosticar, si cumple con las condiciones de la garantia
	// indica que el coste de la reparacion será 0, sino indicará que la garantia no
	// le cubre
	public static void diagnosticarDeGarantia(Vehiculo vehiculoEnGarantia) {
		diagnosticar(vehiculoEnGarantia);
		Calendar calendar = Calendar.getInstance();
		boolean detectadoFraude = false;
		if (calendar.getTime().after(vehiculoEnGarantia.getFechaExpiracionGarantia()) || detectadoFraude
				|| !(Arrays.deepEquals(vehiculoEnGarantia.getAverias(), vehiculoEnGarantia.getAveriasAntiguas()))) {

			System.out.println("DIAGNOSTICO DE GARANTIA: La garantia NO le cubre");

		} else {
			System.out.println(
					"DIAGNOSTICO DE GARANTIA: Haciendo uso de la garantía se reparará su vehiculo a coste 0\n");
		}

	}

	// no se ampliará la fecha de garantia
	public static void repararConGarantia(Vehiculo vehiculoEnGarantia) {

		Reparación reparación = new Reparación();
		vehiculoEnGarantia.setAverias(null);
		vehiculoEnGarantia.setFechaUltimaReparacion(reparación.getFechaDeReparacion());
		// Una vez reparado lo sacamos del taller
		getVehiculosIngresados().remove(vehiculoEnGarantia);
		
		System.out.println("REPARACION CON GARANTIA: " + vehiculoEnGarantia + " ha sido reparado con fecha "
				+ vehiculoEnGarantia.getFechaUltimaReparacion() + " ,tiene garantia hasta "
				+ vehiculoEnGarantia.getFechaExpiracionGarantia()
				+ ". Actualmente las averias que presenta su vehiculo son: "
				+ Arrays.toString(vehiculoEnGarantia.getAverias()) + "\n");

	}

	@Override
	public String toString() {
		return "Vehiculos ingresados: " + getVehiculosIngresados();
	}

}
