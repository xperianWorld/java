package com.xperianworld.threading;

public class Caller implements Runnable {
	String msg;
	CallMe target;
	Thread t;

	public Caller(String msg, CallMe target) {
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		target.call(msg);
		synchronized (target) {
			target.call(msg);
		}
	}

}
