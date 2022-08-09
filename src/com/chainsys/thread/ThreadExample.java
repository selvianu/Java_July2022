package com.chainsys.thread;

public class ThreadExample implements Runnable {
	
	int no1;

	ThreadExample() {
	}

	ThreadExample(int no1) {
		this.no1 = no1;
	}

	@Override
	public void run() {
		ThreadExample t = new ThreadExample(2);
		new Thread().start();

	}

}
