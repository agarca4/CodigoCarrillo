package com.acing.app;

import com.acing.back.Coche;
import com.acing.back.Moto;
import com.acing.back.Vehiculo;

public class App {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo("audi", "blanco");
		Vehiculo c1 = new Coche("seat", "azul", "7575lll");
		Vehiculo m1 = new Moto("yamaha", "roja");
		
		
		System.out.println(v1);
		System.out.println(c1);
		System.out.println(m1);
		

	}

}
