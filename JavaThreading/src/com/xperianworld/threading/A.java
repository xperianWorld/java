package com.xperianworld.threading;

public class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo()");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted A ");
		}

		System.out.println(name + " calling B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside A.last()");
	}
}
