package com.xperianworld.threading;

public class RunThreadImpl implements Runnable {

	Thread t;

	public RunThreadImpl() {
		t = new Thread(this, "Custom Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunThreadImpl rt = new RunThreadImpl();
		rt.t.start();

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("FROM MAIN THREAD, the value of i = " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread exit");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("from run method, the value of i = " + i);
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child thread exit");
	}

}
