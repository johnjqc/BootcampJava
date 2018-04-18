package com.jsoft.bootcamp;

import com.jsoft.bootcamp.common.IProblem;
import com.jsoft.bootcamp.common.ProblemFactory;
import com.jsoft.bootcamp.common.ProblemNames;

/**
 * Bootcamp Problemas
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public class App {
	
	/** The problem implementation */
	private static IProblem problem;
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
			if ("--help".equals(args[0])) {
				System.out.println("Digite el numero de cada problema con sus parametros");
				System.out.println();
				System.out.println("1. Multiplos {number1} {number2}");
				System.out.println("2. Bisiesto {number1}");
				System.out.println("3. Maximo {number1} {number2} {number3}");
				System.out.println("4. Secuencia I {number1}");
				System.out.println("5. Secuencia II {number1}");
				System.out.println("6. Ultimo Digito {number1}");
				System.out.println("7. Truncar {number1}");
				System.out.println("8. Ivertir Numero {number1}");
				System.out.println("9. Trianulo Valido {number1} {number2} {number3}");
				System.out.println("10. Frases Danzantes {String}");
				
			}
			problem = ProblemFactory.create(ProblemNames.valueOf(Integer.valueOf(args[0])));
			switch (args[0]) {
			case "1":
				problem.solution(args[1], args[2]);
				break;
			case "2":
				problem.solution(args[1]);
				break;
			case "3":
				problem.solution(args[1], args[2], args[3]);
				break;
			case "4":
				problem.solution(args[1]);
				break;
			case "5":
				problem.solution(args[1]);
				break;
			case "6":
				problem.solution(args[1]);
				break;
			case "7":
				problem.solution(args[1]);
				break;
			case "8":
				problem.solution(args[1]);
				break;
			case "9":
				problem.solution(args[1], args[2], args[3]);
				break;
			case "10":
				problem.solution(args[1]);
				break;

			default:
				System.out.println("Use --help for view options");
				break;
			}
		} else {
			System.out.println("Use --help for view options");
		}
		
	}
}
