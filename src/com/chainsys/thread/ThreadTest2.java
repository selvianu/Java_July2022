package com.chainsys.thread;


public class ThreadTest2 {

	public static void main(String[] args) throws InterruptedException {
		AThread t1 = new AThread();
		AThread t2 = new AThread();
		t1.start();
		t2.start();

	}

}
