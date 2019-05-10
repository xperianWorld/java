package com.xperianworld.threading;

public class DemoJoin {
	public static void main(String[] args) {
		JoinThread jt = new JoinThread("One");
		JoinThread jt2 = new JoinThread("Two");
		JoinThread jt3 = new JoinThread("Three");

		jt.t.start();
		jt2.t.start();
		jt3.t.start();

		System.out.println("Thread one is alive: " + jt.t.isAlive());
		System.out.println("Thread two is alive: " + jt2.t.isAlive());
		System.out.println("Thread three is alive: " + jt3.t.isAlive());

		try {
			System.out.println("Wainting threads to finish");
			jt.t.join();
			jt2.t.join();
			jt3.t.join();
			System.out.println("Hi there");
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");

		}

		System.out.println("Thread one is alive: " + jt.t.isAlive());
		System.out.println("Thread two is alive: " + jt2.t.isAlive());
		System.out.println("Thread three is alive: " + jt3.t.isAlive());

		System.out.println("Exiting main thread");
	}
}
