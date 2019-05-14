package com.xperianworld.threading;

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();
	Thread t;

	public DeadLock() {
		Thread.currentThread().setName("Main Thread");
		t = new Thread(this, "Racing Thread");

	}

	void deadLockStart() {
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.bar(a);
		System.out.println("Back in other thread");
	}

	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.deadLockStart();
	}

}
