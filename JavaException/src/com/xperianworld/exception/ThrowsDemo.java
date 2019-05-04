package com.xperianworld.exception;

public class ThrowsDemo {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throw one.");
		throw new IllegalAccessException("throwOne()");
	}

	public static void main(String[] args) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught " + e);
		}
	}
}
