package com.jsoft.bootcamp.util;

/**
 * Helper for Bootcamp project
 * 
 * @author <a href="johnquirogac@gmail.com">John Quiroga C</a>
 *
 */
public final class BootcampHelper {

	/** The private constructor */
	private BootcampHelper() {}
	
	/**
	 * Validate if a number is par
	 * 
	 * @param number the number to validate
	 * @return True if number is par
	 */
	public static boolean isPar(int number) {
		return number % 2 == 0;
	}
	
	/**
	 * Validate if {@code number1} number is multiple {@code number2}
	 * @param number1 the number 1
	 * @param number2 the number 2
	 * @return True if {@code number1} number is multiple {@code number2}
	 */
	public static boolean isMultiple(int number1, int number2) {
		return number1 % number2 == 0;
	}

}
