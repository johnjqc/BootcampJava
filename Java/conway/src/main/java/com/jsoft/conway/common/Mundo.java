package com.jsoft.conway.common;

public class Mundo {
	
	private final static String CRLF = System.lineSeparator();
	private static final String TAB = "\t";
	
	private final Celula[][] mundo;
	
	private Mundo(Builder builder) {
		this.mundo = new Celula[builder.ancho][builder.alto];
	}
	
	public static Builder newBuilder() {
		return new Builder();
	}
	
	public Celula[][] getMundo() {
		return mundo;
	}
	
	public Celula getCelula(Punto punto) {
		return mundo[punto.getX()][punto.getY()];
	}
	
	public void setCelula(Celula celula, Punto punto) {
		mundo[punto.getX()][punto.getY()] = celula;
	}
	
	public Punto tamaño() {
		return new Punto(mundo.length, mundo[0].length);
	}
	
	public static class Builder {
		
		private int ancho;
		private int alto;
		
		public Builder ancho(int ancho) {
			this.ancho = ancho;
			return this;
		}
		
		public Builder alto(int alto) {
			this.alto = alto;
			return this;
		}
		
		public Mundo build() {
			return new Mundo(this);
		}
	}
	
	public Mundo clone() {

		Mundo clone = newBuilder()
				.alto(mundo.length)
				.ancho(mundo[0].length)
				.build();
		
		for (int i = 0; i < mundo.length; i++) {
			for (int j = 0; j < mundo[i].length; j++) {
				Punto punto = new Punto(i, j);
				clone.setCelula(new Celula(this.getCelula(punto).getEstado()), punto);
			}
		}
		
		return clone;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < mundo.length; x++) {
			for (int y = 0; y < mundo.length; y++) {
				sb.append(mundo[x][y] + TAB);
			}
			sb.append(CRLF);
		}
		return sb.toString();
	}
}
