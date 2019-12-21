package acing.comun;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import acing.taller.vehiculos.VehiculoIngresadoImpl;


public interface Taller<T> {
	
	void ingresar(T Objeto, String fechaIngreso);
	
	void diagnosticar(T Objeto);
	
	void reparar(T Objeto);
	
	void egresar(T Objeto, String fechaEgreso);


	

	
	
	

	
	

}