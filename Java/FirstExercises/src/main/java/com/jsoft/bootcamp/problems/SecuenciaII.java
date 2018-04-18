package com.jsoft.bootcamp.problems;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Calcula la secuencia 1 + 1/2 + 1/3 + … + 1/n
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class SecuenciaII implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		Integer number = Integer.valueOf(String.valueOf(params[0]));
		double result = 1L;
		
		for (int i = 3, j = 2; i <= number; i+= 2, j += j) {
			result += (double)(i/j);
		}
		
		System.out.println(String.format("El resultado de la secuencia hasta %s es: %s", number, result));
		
	}

}
