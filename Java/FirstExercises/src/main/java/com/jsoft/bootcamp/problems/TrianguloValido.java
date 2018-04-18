package com.jsoft.bootcamp.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.jsoft.bootcamp.common.IProblem;

/**
 * Valida si 3 numero pueden formar un triangulo
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class TrianguloValido implements IProblem {

	/* (non-Javadoc)
	 * @see com.jsoft.bootcamp.common.IProblem#solution(java.lang.Object[])
	 */
	@Override
	public void solution(Object... params) {

		List<Integer> numbers = Arrays.stream(params)
				.map(Object::toString)
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		Collections.sort(numbers);
		
		int sumatoria = numbers.get(0) + numbers.get(1);
		
		if (sumatoria > numbers.get(2)) {
			
			System.out.println("Los numeros SI pueden hacer un triagulo");
		} else {
			
			System.out.println("Los numeros NO pueden hacer un triagulo");
		}
	}

}
