package com.jsoft.bootcamp.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Valida cual es el numero maximo 
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class Maximo implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		List<Integer> numbers = Arrays.stream(params)
				.map(Object::toString)
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		Integer maximo = Collections.max(numbers);
		
		System.out.println(String.format("El numero maximo de %s es: %s", numbers, maximo));
	}

}
