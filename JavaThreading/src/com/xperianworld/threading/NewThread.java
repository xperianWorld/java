package com.xperianworld.threading;

public class NewThread implements Runnable {

	String name;
	Thread t;

	boolean suspendFlag;

	public NewThread(String name) {
		super();
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		suspendFlag = false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted " + name);
		}
		System.out.println("Exiting " + name);
	}

	synchronized void suspend() {
		suspendFlag = true;
	}

	synchronized void resume() {
		suspendFlag = false;
		notify();
	}
}
