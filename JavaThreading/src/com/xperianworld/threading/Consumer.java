package com.xperianworld.threading;

public class Consumer implements Runnable {
	Q q;
	Thread t;

	public Consumer(Q q) {
		super();
		this.q = q;
		t = new Thread(this, "Consumer");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			q.get();
		}
	}

}
