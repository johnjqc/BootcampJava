package com.jsoft.bootcamp.problems;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Inviente un numero dado
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class InversorNumero implements IProblem {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		Integer number = Integer.valueOf(String.valueOf(params[0]));
		int result = 0;
		
		while (number != 0) {
			result = result * 10;
			result = result + number % 10;
			number = number / 10;
		}

		System.out.println(String.format("El numero invertido es: %s", result));

	}

}
