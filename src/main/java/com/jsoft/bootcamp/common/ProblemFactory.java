package com.jsoft.bootcamp.common;

import java.security.InvalidParameterException;
import java.util.HashMap;

import com.jsoft.bootcamp.problems.Bisiesto;
import com.jsoft.bootcamp.problems.FrasesDanzantes;
import com.jsoft.bootcamp.problems.InversorNumero;
import com.jsoft.bootcamp.problems.Maximo;
import com.jsoft.bootcamp.problems.Multiplos;
import com.jsoft.bootcamp.problems.SecuenciaI;
import com.jsoft.bootcamp.problems.SecuenciaII;
import com.jsoft.bootcamp.problems.TrianguloValido;
import com.jsoft.bootcamp.problems.Truncar;
import com.jsoft.bootcamp.problems.UltimoDigito;

/**
 * Factory for {@link IProblem}
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class ProblemFactory {
	
	/** The problem hash map */
	private static HashMap<ProblemNames, IProblem> problems = new HashMap<>();
	
	static {
		problems.put(ProblemNames.MULTIPLOS, new Multiplos());
		problems.put(ProblemNames.BISIESTO, new Bisiesto());
		problems.put(ProblemNames.MAXIMO, new Maximo());
		problems.put(ProblemNames.SECUENCIA_I, new SecuenciaI());
		problems.put(ProblemNames.SECUENCIA_II, new SecuenciaII());
		problems.put(ProblemNames.ULTIMO_DIGITO, new UltimoDigito());
		problems.put(ProblemNames.TRUNCAR, new Truncar());
		problems.put(ProblemNames.INVERSOR_NUMERO, new InversorNumero());
		problems.put(ProblemNames.TRIANGULO_VALIDO, new TrianguloValido());
		problems.put(ProblemNames.FRASES_DANZANTES, new FrasesDanzantes());
	}
	
	
	/** The private factory */
	private ProblemFactory() {}

	/**
	 * Create a problem with given value
	 * 
	 * @param problem the problem value
	 * @return Problem implementation if exist
	 */
	public static IProblem create(ProblemNames problem) {
		
		if (problems.containsKey(problem)) {
			return problems.get(problem);
		}
		
		throw new InvalidParameterException("The parameter for problem factory has invalid value");
	}

}
