package com.jsoft.conway.common;

public class Juego {

	private final Mundo mundo;
	private final int generaciones;
	
	public Juego(final Mundo mundo, final int generaciones) {
		this.mundo = mundo;
		this.generaciones = generaciones;
	}
	
	public Mundo getMundo() {
		return mundo;
	}
	public int getGeneraciones() {
		return generaciones;
	}
}
