package com.xperianworld.exception;


public class ThrowDemo {
	static void demoPro() {
		try {
			throw new NullPointerException("Demo");

		} catch (NullPointerException e) {
			System.out.println("Caught inside demoPro()");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			demoPro();
		} catch (NullPointerException e) {
			System.out.println("Recaught " + e);
		}
	}
}