package com.xperianworld.threading;

public class JoinThread implements Runnable {

	String name;
	Thread t;

	public JoinThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("JoinThread: " + t);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Message: " + e);
		}

		System.out.println("Exiting " + name);
	}

}
