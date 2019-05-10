package com.xperianworld.threading;

public class ThreadExtension extends Thread {

	public ThreadExtension() {
		super("Demo Thread");
		System.out.println("ThreadExecution = " + this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("from run method, the value of i = " + i);
				sleep(500);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Demo thread exit");
	}

}
