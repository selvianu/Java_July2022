package com.chainsys.thread;

public class Thread1 implements Runnable {
//main as a thread and thread1 as a separate thread
	private String data;

	public Thread1(String data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(2000);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Thread main finished");

			}
		}

	}

	public static void main(final String[] args) {

		System.out.println("Thread main started");

		Thread thread1 = new Thread(new Thread1("Runnable"));
		thread1.start();

	}
}