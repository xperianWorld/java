package com.xperianworld.threading;

public class Synch {
	public static void main(String[] args) {
		CallMe target = new CallMe();
		Caller caller1 = new Caller("caller one", target);
		Caller caller2 = new Caller("caller two", target);
		Caller caller3 = new Caller("caller three", target);

		caller1.t.start();
		caller2.t.start();
		caller3.t.start();
		try {
			caller1.t.join();
			caller2.t.join();
			caller3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Main");
		}
		System.out.println("Exiting the main");
	}
}
