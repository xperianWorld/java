package com.xperianworld.threading;

/**
 * 
 * @author xw
 * 
 * @see Multi-Threading Threads state: 1. running 2. ready to run 3. suspended
 *      4. resumed 5. blocked.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
		System.out.println("Current thread = " + t);
		t.setName("My thread custom");
		System.out.println(t.getName());

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Message: " + e);
		}
		t.setName("Second name");
		System.out.println("Second name= " + t);

		ThreadExtension te = new ThreadExtension();
		te.start();

		MultiThreadExample mte = new MultiThreadExample("One");
		MultiThreadExample mte2 = new MultiThreadExample("Two");
		MultiThreadExample mte3 = new MultiThreadExample("Three");

		mte.t.start();
		mte2.t.start();
		mte3.t.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exit");
	}

}
