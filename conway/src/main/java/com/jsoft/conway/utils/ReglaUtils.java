package com.jsoft.conway.utils;

import com.jsoft.conway.common.Celula;
import com.jsoft.conway.common.Estado;
import com.jsoft.conway.common.Regla;

public class ReglaUtils {

	private ReglaUtils() {
		throw new AssertionError("No instantiable class");
	}
	
	public static Regla obtenerRegla(final Estado estado, final int vecinosVivos) {
		
		if (Estado.VIVA.equals(estado) && vecinosVivos < 2) {
			return Regla.MUERE;
		} else if (Estado.VIVA.equals(estado) && (vecinosVivos == 2 || vecinosVivos == 3)) {
			return Regla.VIVE;
		} else if (Estado.VIVA.equals(estado) && vecinosVivos > 3) {
			return Regla.MUERE;
		} else if (Estado.MUERTA.equals(estado) && vecinosVivos == 3) {
			return Regla.VIVE;
		}
		
		return Estado.VIVA.equals(estado) ? Regla.VIVE : Regla.MUERE;
	}
	
	public static Celula aplicarRegla(final Regla regla) {
		
		if (Regla.VIVE.equals(regla)) {
			return new Celula(Estado.VIVA);
		} else {
			return new Celula(Estado.MUERTA);
		}
	}
}
