package com.xperianworld.threading;

public class PC {
	public static void main(String[] args) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.t.start();
		c.t.start();

		System.out.println("Press ctrl+c to stop");
	}
}
