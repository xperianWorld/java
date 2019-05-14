package com.xperianworld.threading;

public class SuspendResume {
	public static void main(String[] args) {
		NewThread newThread = new NewThread("ONE");
		NewThread newThread2 = new NewThread("TWO");

		newThread.t.start();
		newThread2.t.start();

		try {
			Thread.sleep(1000);
			newThread.suspend();
			System.out.println("Suspending thread one");
			Thread.sleep(1000);
			newThread.resume();
			System.out.println("Resuming thread one");
			newThread2.suspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			newThread2.resume();
			System.out.println("Resuming thread two");
		} catch (InterruptedException e) {
			System.out.println("Interrupted MAIN");
		}

//		wait threads to finish
		try {
			System.out.println("Waiting threads to finish");
			newThread.t.join();
			newThread2.t.join();

		} catch (InterruptedException e) {
			System.out.println("Interrupted while waiting");
		}
		System.out.println("Main thread exit");
	}
}
