package com.xperianworld.exception;

public class FinallyDemo {
	/*
	 * This method will throw the RuntimeEception which will be caught by the
	 * calling statement
	 */
	static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("FinallyDemo");
		} finally {
			System.out.println("Inside procA finally");
		}
	}

	/*
	 * This method tries to return the execution after it encounters the return
	 * statement, but since the finally block is present, the execution returns
	 * after the finally block
	 */
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		} finally {
			System.out.println("Inside procB finally");
		}
	}

	static void procC() {
		try {
			System.out.println("inside procC");

		} finally {
			System.out.println("Inside procC finally");
		}
	}

	public static void main(String[] args) {
		try {
			procA();

		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}
}