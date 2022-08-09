package com.chainsys.thread;

public class MyTask extends Thread {
	String Data;

	public MyTask() {

	}

	public static void main(String[] args) {

		System.out.println("Thread main started");

		Thread thread1 = new MyTask();
		Thread thread2 = new MyTask();

		thread1.start();
		thread2.start();

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
			// Message " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
