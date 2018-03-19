package com.jsoft.conway.common;

public class Celula {
	
	private Estado estado;
	
	public Celula() {
		this.estado = Estado.MUERTA;
	}
	
	public Celula(Estado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return estado;
	}

	public boolean estaViva() {
		return Estado.VIVA.equals(estado);
	}
	
	@Override
	public String toString() {
		return estado.toString();
	}
}
