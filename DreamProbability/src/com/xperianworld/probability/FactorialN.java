package com.xperianworld.probability;

public class FactorialN {

	public static int factorial(int number) {
		return calculate(number);
	}

	private static int calculate(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
