package com.jsoft.bootcamp.problems;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Retorna el ultimo digito de un numero
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class UltimoDigito implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		Double number = Double.valueOf(String.valueOf(params[0]));
		
		int n1 = (int)(number / 10);
		double n2 = number / 10;
		n2 = n2 - n1;
		System.out.println(String.format("El ultimo digito es: %s", Math.round(n2 * 10)));
		
	}

}
