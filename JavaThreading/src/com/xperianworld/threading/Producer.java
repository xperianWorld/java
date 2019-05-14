package com.xperianworld.threading;

public class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q) {
		this.q = q;
		t = new Thread(this, "Producer");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}

}
