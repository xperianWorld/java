package com.xperianworld.threading;

public class Q {
	int n;

	boolean valueSet = false;

	synchronized int get() {

		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;

	}

	synchronized void put(int n) {
		while (valueSet)
			try {
				wait();

			} catch (InterruptedException e) {
				System.out.println("Interruption caught");
			}
		this.n = n;
		System.out.println("Put: " + n);
		valueSet = true;
		notify();

	}
}
