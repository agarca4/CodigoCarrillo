package ejercicio11.poo;

import java.util.Arrays;
import java.util.Objects;

public class Partido {

	private String resultado;
	private String equipoLocal;
	private String equipoVisitante;

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Partido() {

		int resultadoLocal = MetodosSueltos.generaNumeroAleatorio(0, 5);
		int resultadoVisitante = MetodosSueltos.generaNumeroAleatorio(0, 5);
		setResultado(resultadoLocal + "-" + resultadoVisitante);

		int equipoLocal = MetodosSueltos.generaNumeroAleatorio(0, 11);

		String equipoLocalString = "";

		switch (equipoLocal) {
		case 0:
			equipoLocalString = "Madrid";
			break;
		case 1:
			equipoLocalString = "Barcelona";
			break;
		case 2:
			equipoLocalString = "Betis";
			break;
		case 3:
			equipoLocalString = "Sevilla";
			break;
		case 4:
			equipoLocalString = "Atletico";
			break;
		case 5:
			equipoLocalString = "Valencia";
			break;
		case 6:
			equipoLocalString = "Osasuna";
			break;
		case 7:
			equipoLocalString = "Granada";
			break;
		case 8:
			equipoLocalString = "Almeria";
			break;
		case 9:
			equipoLocalString = "Español";
			break;
		case 10:
			equipoLocalString = "Bilbao";
			break;
		case 11:
			equipoLocalString = "Coruña";
			break;

		default:
			break;
		}

		int equipoVisitante = MetodosSueltos.generaNumeroAleatorio(0, 11);
		if (equipoVisitante == equipoLocal) {
			do {
				equipoVisitante = MetodosSueltos.generaNumeroAleatorio(0, 11);

			} while (equipoVisitante == equipoLocal);

		}

		String equipoVisitanteString = "";

		switch (equipoVisitante) {
		case 0:
			equipoVisitanteString = "Madrid";
			break;
		case 1:
			equipoVisitanteString = "Barcelona";
			break;
		case 2:
			equipoVisitanteString = "Betis";
			break;
		case 3:
			equipoVisitanteString = "Sevilla";
			break;
		case 4:
			equipoVisitanteString = "Atletico";
			break;
		case 5:
			equipoVisitanteString = "Valencia";
			break;
		case 6:
			equipoVisitanteString = "Osasuna";
			break;
		case 7:
			equipoVisitanteString = "Granada";
			break;
		case 8:
			equipoVisitanteString = "Almeria";
			break;
		case 9:
			equipoVisitanteString = "Español";
			break;
		case 10:
			equipoVisitanteString = "Bilbao";
			break;
		case 11:
			equipoVisitanteString = "Coruña";
			break;

		default:
			break;
		}

		setEquipoLocal(equipoLocalString);
		setEquipoVisitante(equipoVisitanteString);

	}

	public static boolean repiteEquipo(Partido[] partidos) {

		String[] equiposLocales = new String[partidos.length];
		String[] equiposVisitantes = new String[partidos.length];
		boolean encontrado = false;

		for (int i = 0; i < partidos.length; i++) {
			equiposVisitantes[i] = partidos[i].getEquipoVisitante();
			equiposLocales[i] = partidos[i].getEquipoLocal();

		}
		Arrays.sort(equiposVisitantes);
		for (int i = 0; i < equiposVisitantes.length - 1; i++) {
			if (equiposVisitantes[i] == equiposVisitantes[i + 1]) {
				encontrado = true;
				break;
			}
		}
		Arrays.sort(equiposLocales);
		for (int i = 0; i < equiposLocales.length - 1; i++) {
			if (equiposLocales[i] == equiposLocales[i + 1]) {
				encontrado = true;
				break;
			}
		}

		for (int i = 0; i < equiposVisitantes.length; i++) {
			for (int j = 0; j < equiposLocales.length; j++) {
				if (Objects.equals(equiposVisitantes[i], equiposLocales[j])) {
					encontrado = true;
				}

			}

		}

		return encontrado;
	}

	@Override
	public String toString() {
		return getEquipoLocal() + "-" + getEquipoVisitante() + ":" + getResultado();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipoLocal == null) ? 0 : equipoLocal.hashCode());
		result = prime * result + ((equipoVisitante == null) ? 0 : equipoVisitante.hashCode());
		result = prime * result + ((resultado == null) ? 0 : resultado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		if (equipoLocal == null) {
			if (other.equipoLocal != null)
				return false;
		} else if (!equipoLocal.equals(other.equipoLocal))
			return false;
		if (equipoVisitante == null) {
			if (other.equipoVisitante != null)
				return false;
		} else if (!equipoVisitante.equals(other.equipoVisitante))
			return false;
		if (resultado == null) {
			if (other.resultado != null)
				return false;
		} else if (!resultado.equals(other.resultado))
			return false;
		return true;
	}



}
