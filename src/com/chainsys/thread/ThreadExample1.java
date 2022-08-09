package com.chainsys.thread;

public class ThreadExample1 extends Thread {
 ThreadExample1() {
	 System.out.println();
}
	public void run() {
		System.out.println("Thread Started Running...");
	}

	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		// invoking Thread
		t1.run();
		ThreadExample1 t2 = new ThreadExample1();
		// invoking Thread
		t2.run();

	}

}
