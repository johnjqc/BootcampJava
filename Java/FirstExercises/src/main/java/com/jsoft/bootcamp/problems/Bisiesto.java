package com.jsoft.bootcamp.problems;

import com.jsoft.bootcamp.common.IProblem;
import static com.jsoft.bootcamp.util.BootcampHelper.isMultiple;

/**
 * Valida si un año es bisiento
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class Bisiesto implements IProblem {


	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		Integer year = Integer.valueOf(String.valueOf(params[0]));
		if (isMultiple(year, 4) && (!isMultiple(year, 100) || isMultiple(year, 400))) {
			
			System.out.println("El año es bisiesto");
		} else {
			
			System.out.println("El año no es bisiesto");
		}
	}

}
