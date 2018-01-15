package com.jsoft.bootcamp.problems;

import java.util.Arrays;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Resuelve el problema de frases danzantes
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class FrasesDanzantes implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		String frase = String.valueOf(params[0]);
		
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			
			if (Character.isLetter(palabras[i].charAt(0))) {
				String upper = String.valueOf(palabras[i].charAt(0)).toUpperCase();
				palabras[i] = upper + palabras[i].substring(1);
			}
		}
		
		System.out.println(String.join(" ", Arrays.asList(palabras)));
	}

}
