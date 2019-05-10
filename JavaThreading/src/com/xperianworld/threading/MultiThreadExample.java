package com.xperianworld.threading;

public class MultiThreadExample implements Runnable {
	String name;
	Thread t;

	public MultiThreadExample(String threadName) {
		name = threadName;
		t = new Thread(this, threadName);
		System.out.println("Started " + t);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("from run method, the value of i = " + i);
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName() + " thread exit");

	}

}
