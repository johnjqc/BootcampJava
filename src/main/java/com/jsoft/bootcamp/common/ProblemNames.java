package com.jsoft.bootcamp.common;

import java.security.InvalidParameterException;

/**
 * Problems enumeration
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public enum ProblemNames {

	MULTIPLOS,
	
	BISIESTO,
	
	MAXIMO,
	
	SECUENCIA_I,
	
	SECUENCIA_II,
	
	ULTIMO_DIGITO,
	
	TRUNCAR,
	
	INVERSOR_NUMERO,
	
	TRIANGULO_VALIDO,
	
	FRASES_DANZANTES;
	
	
	public static ProblemNames valueOf(int option) {
		switch (option) {
		case 1:
			return MULTIPLOS;
		case 2:
			return BISIESTO;
		case 3:
			return MAXIMO;
		case 4:
			return SECUENCIA_I;
		case 5:
			return SECUENCIA_II;
		case 6:
			return ULTIMO_DIGITO;
		case 7:
			return TRUNCAR;
		case 8:
			return INVERSOR_NUMERO;
		case 9:
			return TRIANGULO_VALIDO;
		case 10:
			return FRASES_DANZANTES;
		default:
			throw new InvalidParameterException("The parameter for problem enum has invalid value");
		}
	}

}
