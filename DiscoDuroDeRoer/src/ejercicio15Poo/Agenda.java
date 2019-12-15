package ejercicio15Poo;

import java.util.Arrays;

public class Agenda {

	public int TAMAÑO_AGENDA_DEF = 10;

	private Contacto[] contactos;

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	public Agenda() {
		contactos = new Contacto[TAMAÑO_AGENDA_DEF];
	}

	public Agenda(int tamañoAgenda) {
		contactos = new Contacto[tamañoAgenda];
	}

	public void añadirContacto(Contacto c) {
		for (int i = 0; i < contactos.length; i++) {
			if (existeContacto(c)) {
				break;
			} else if (contactos[i] == null) {
				contactos[i] = c;
				break;
			} else if (agendaLlena()) {
				break;
			}
		}
	}

	public boolean existeContacto(Contacto c) {
		boolean existeContacto = false;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].getNombre() == c.getNombre()) {
				existeContacto = true;
				break;
			}
		}
		return existeContacto;
	}

	public void listarContactos() {
		for (Contacto contacto : contactos) {
			if (contacto != null) {
				System.out.println(contacto);
			}
		}
		System.out.println("\n");
	}

	public void buscarContacto(String nombre) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].getNombre() == nombre) {
				System.out.println(contactos[i].getTelefono());
				break;
			} else if (i == (contactos.length - 1)) {

				System.out.println("No tiene ese contacto guardado");

			}
		}
	}

	public void eliminarContacto(Contacto c) {
		if (existeContacto(c)) {
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null && contactos[i].getNombre() == c.getNombre()) {
					contactos[i] = null;
					System.out.println("Contacto eliminado");
					break;
				}
			}
		} else {
			System.out.println("No puedo eliminar un contacto que no tiene, imbecil");
		}
	}

	public boolean agendaLlena() {
		boolean agendaLlena = false;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				break;
			} else if (contactos[i] != null && i == (contactos.length - 1)) {
				System.out.println("La agenda está llena, no se pueden añadir mas contactos");
				agendaLlena = true;
			}
		}
		return agendaLlena;
	}
	
	public void huecosLibres() {
		if (agendaLlena()) {	
		}else {
			int numeroDeHuecos = contactos.length;
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null) {
					numeroDeHuecos = numeroDeHuecos - 1;
				}	
			}
			System.out.println("Hay " + numeroDeHuecos + " huecos.");
		}
	}

	@Override
	public String toString() {
		return "Agenda [getContactos()=" + Arrays.toString(getContactos()) + "]";
	}

}
