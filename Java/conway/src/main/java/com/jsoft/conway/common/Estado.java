package com.jsoft.conway.common;

public enum Estado {
	
	VIVA("*"),
	
	MUERTA(".");
	
	private static final String CELULA_VIVA = "*";
	
	String estado;
	
	Estado(String estado) {
		this.estado = estado;
	}
	
	public static Estado de(String valor) {
		
		if (CELULA_VIVA.equals(valor)) {
			return VIVA;
		} else {
			return MUERTA;
		}
	}
	
	@Override
	public String toString() {
		return estado;
	}
}
