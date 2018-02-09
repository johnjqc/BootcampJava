package com.jsoft.figuras.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Shapes {

	private static final String SPACE = " ";
	private static final String CHARACTER = "*";
	private static final int DEFAULT_SIZE = 3; 
	
	private Shapes() {
		throw new AssertionError("No instantiable class");
	}
	
	public static String square() {
		return square(DEFAULT_SIZE);
	}
	
	public static String square(int tamaño) {
		return String.join(System.lineSeparator(), buildShapeWithoutSaces(tamaño, tamaño));
	}
	
	public static String triangle() {
		return triagle(DEFAULT_SIZE);
	}
	
	public static String triagle(int tamaño) {
		List<String> lineas = buildShapeWithoutSaces(tamaño, 0);
		fillSpaces(tamaño, lineas);
		return String.join(System.lineSeparator(), lineas);
	}
	
	public static String diamond() {
		return diamond(DEFAULT_SIZE);
	}
	
	public static String diamond(int tamaño) {
		StringBuilder sb = new StringBuilder();
		sb.append(triagle(tamaño));
		sb.append(System.lineSeparator());
		
		List<String> lineas = buildShapeWithoutSaces(tamaño - 1, 0);
		fillSpaces(tamaño, lineas);
		Collections.reverse(lineas);
		sb.append(String.join(System.lineSeparator(), lineas));
		
		return sb.toString();
	}
	
	private static boolean shapeHight(int tamaño, int i) {
		return i < tamaño;
	}

	private static void fillSpaces(int tamaño, List<String> lineas) {
		for (int i = 0; i < lineas.size(); i++) {
			lineas.set(i, fillLine(numberofSpacesByLine(tamaño, i), SPACE).concat(lineas.get(i))); 
		}
	}
	
	private static List<String> buildShapeWithoutSaces(int tamaño, int longitud) {
		List<String> lineas = new ArrayList<>();
		for (int i = 0; shapeHight(tamaño, i); i++) {
			lineas.add(fillLine(longitud == 0 ? numberOfCharacterByLine(i) : longitud, CHARACTER));
		}
		return lineas;
	}
	
	private static String fillLine(int longitud, String caracter) {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < longitud; j++) {
			sb.append(caracter);
		}
		return sb.toString();
	}

	private static int numberOfCharacterByLine(int posicionVertical) {
		return (posicionVertical * 1) + (posicionVertical +1);
	}

	private static int numberofSpacesByLine(int tamaño, int posicionVertical) {
		return tamaño - (posicionVertical + 1);
	}
	
}
