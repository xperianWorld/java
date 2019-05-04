package com.xperianworld.exception;

public class ChainedException {
	static void chainDemo() {
		NullPointerException nullException = new NullPointerException("top layer");

		nullException.initCause(new ArithmeticException("cause"));
		throw nullException;
	}

	public static void main(String[] args) {
		try {
			chainDemo();
		} catch (NullPointerException e) {
			System.out.println("Caught: " + e);
			System.out.println("Original cause: " + e.getCause());
		}
	}
}
