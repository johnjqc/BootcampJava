package com.jsoft.conway.utils;

import java.util.ArrayList;
import java.util.List;

import com.jsoft.conway.common.Celula;
import com.jsoft.conway.common.Estado;
import com.jsoft.conway.common.Mundo;
import com.jsoft.conway.common.Punto;
import com.jsoft.conway.common.Regla;

public class MundoUtils {
	
	private final static int[] DX = {-1,-1,-1, 0, 0, 1, 1, 1};
	private final static int[] DY = {-1, 0, 1,-1, 1,-1, 0, 1};

	
	private MundoUtils() {
		throw new AssertionError("No instantiable class");
	}

	public static List<Mundo> crearMundos(Mundo mundoInicial, int generaciones) {
		final List<Mundo> mundos = new ArrayList<>();
		mundos.add(mundoInicial);
		
		Mundo nuevoMundo = mundoInicial.clone();
		for (int i = 1; i <= generaciones; ++i) {
			nuevoMundo = crearMundo(nuevoMundo);
			mundos.add(nuevoMundo);
		}
		
		return mundos;
	}
	
	public static Mundo crearMundo(final Mundo mundoOrigen) {
		Mundo mundo = mundoOrigen.clone();
		final Punto tamañoMundo = mundo.tamaño();
		
		for (int x = 0; x < tamañoMundo.getX(); x++) {
			for (int y = 0; y < tamañoMundo.getY(); y++) {
				
				Punto puntoActual = new Punto(x, y);
				final int vecinoVivos = contarVecinosVivos(mundoOrigen, puntoActual);
				Regla regla = ReglaUtils.obtenerRegla(mundoOrigen.getCelula(puntoActual).getEstado(), vecinoVivos);
				mundo.setCelula(ReglaUtils.aplicarRegla(regla), puntoActual);
			}
		}
		
		return mundo;
	}
	
	public static int contarVecinosVivos(final Mundo mundo, final Punto actual) {
		
		int vecinosVivos = 0;
		final Punto tamañoMundo = mundo.tamaño();
		
		for (int i = 1; i < 9; ++i) {
			final Punto vecino = posicionVecino(i, actual);
			if (esUnVecinoDentroDelMundo(vecino, tamañoMundo) && esUnVecinoVivo(mundo, vecino)) {
				vecinosVivos++;
			}
		}
		return vecinosVivos;
	}
	
	public static boolean esUnVecinoDentroDelMundo(final Punto posicionVecino, final Punto tamaño) {
		return posicionVecino.getX() >= 0 &&
				posicionVecino.getY() >= 0 &&
				posicionVecino.getX() < tamaño.getX() && 
				posicionVecino.getY() < tamaño.getY();
	}
	
	public static boolean esUnVecinoVivo(final Mundo tablero, final Punto posicionVecino) {
		return tablero.getMundo()[posicionVecino.getX()][posicionVecino.getY()].estaViva();
	}
	
	public static Punto posicionVecino(final int posicion, final Punto actual) {

		final int nx = actual.getX() + DX[posicion - 1];
		final int ny = actual.getY() + DY[posicion - 1];
		
		return new Punto(nx, ny);
	}
	
	public static void crearCelulasConEstado(final Mundo mundo, final Estado estado) {
		
		final Punto tamañoMundo = mundo.tamaño();
		for (int x = 0; x < tamañoMundo.getX(); x++) {
			for (int y = 0; y < tamañoMundo.getY(); y++) {
				
				Punto puntoActual = new Punto(x, y);
				if (mundo.getCelula(puntoActual) == null) {
					mundo.setCelula(new Celula(estado), puntoActual);
				}
			}
		}
	}
}
