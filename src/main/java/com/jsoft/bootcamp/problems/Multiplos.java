package com.jsoft.bootcamp.problems;

import com.jsoft.bootcamp.common.IProblem;
import com.jsoft.bootcamp.util.BootcampHelper;

/**
 * Valida si dos numeros son multiplos entre si
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class Multiplos implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		Integer number1 = Integer.valueOf(String.valueOf(params[0]));
		Integer number2 = Integer.valueOf(String.valueOf(params[1]));
		
		if (BootcampHelper.isMultiple(number1, number2)) {
			
			System.out.println(String.format("El numero %s es multiplo de %s", number1, number2));
		} else {
			
			System.out.println(String.format("Los numeros %s y %s, no son multiplos", number1, number2));
		}
	}

}
