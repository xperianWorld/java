package com.xperianworld.exception;

public class MyExceptionDemo {
	public static void main(String[] args) {
		try {
			compute(1);
			compute(5);
			compute(20);
		} catch (MyException e) {
			System.out.println(e);
		}
	}

	static void compute(int a) throws MyException {
		System.out.println("Called compute(" + a + ")");
		if (a > 10) {
			throw new MyException(a);
		}
		System.out.println("Normal Exit");
	}
}
