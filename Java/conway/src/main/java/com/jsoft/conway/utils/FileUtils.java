package com.jsoft.conway.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import com.jsoft.conway.common.Celula;
import com.jsoft.conway.common.Condiciones;
import com.jsoft.conway.common.Estado;
import com.jsoft.conway.common.Juego;
import com.jsoft.conway.common.Mundo;
import com.jsoft.conway.common.Punto;

public class FileUtils {
	
	private static final int COMIENZO_MUNDO_EN_ARCHIVO = 1;
	
	private FileUtils() {
		throw new AssertionError("No instantiable class");
	}
	
	public static Juego leerJuegoInicial(final File file) {
		
		List<String> lineas = leerArchivo(file);
		Condiciones condiciones = Condiciones.de(lineas.get(0));
		
		Mundo mundo = Mundo.newBuilder()
				.alto(condiciones.getAlto())
				.ancho(condiciones.getAncho())
				.build();
		
		leerMundo(mundo, lineas.subList(COMIENZO_MUNDO_EN_ARCHIVO, lineas.size()));
		
		return new Juego(mundo, condiciones.getGeneraciones());
	}
	
	public static void leerMundo(final Mundo mundo, final List<String> lineas) {
		
		for (int i = 0; i < lineas.size(); i++) {
			
			Celula[] celulas = convertirLinea(lineas.get(i));
			for (int j = 0; j < celulas.length; j++) {
				Punto punto = new Punto(i, j);
				mundo.setCelula(celulas[j], punto);
			}
		}
	}
	
	public static Celula[] convertirLinea(String linea) {
		Celula[] celulas = new Celula[linea.length()];
		
		for (int i = 0; i < celulas.length; i++) {
			celulas[i] = new Celula(Estado.de(String.valueOf(linea.charAt(i))));
		}
		
		return celulas;
	}
	
	public static List<String> leerArchivo(final File file) {
		try {
			return Files.readAllLines(file.toPath());
		} catch (IOException e) {
			throw new IllegalArgumentException("El archivo suministrado tiene problemas: " + e.toString());
		}
	}
}
