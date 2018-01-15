package com.jsoft.bootcamp.problems;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Trunca el ultimo digito de un numero
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class Truncar implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		Double number = Double.valueOf(String.valueOf(params[0]));
		number = (number / 10);
		Integer result = number.intValue();

		System.out.println(String.format("El numero truncado es: %s", result));
	}

}
