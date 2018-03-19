package com.jsoft.conway.common;

public class Condiciones {
	
	private static final String SEPARATOR = " ";

	private int alto;
	private int ancho;
	private int generaciones;
	
	private Condiciones(int alto, int ancho, int generacioes) {
		this.alto = alto;
		this.ancho = ancho;
		this.generaciones = generacioes;
	}
	
	public static Condiciones de(String valor) {
		String [] condiciones = valor.split(SEPARATOR);
		
		return new Condiciones(Integer.valueOf(condiciones[0]),
				Integer.valueOf(condiciones[1]),
				Integer.valueOf(condiciones[2]));
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}

	public int getGeneraciones() {
		return generaciones;
	}
}
