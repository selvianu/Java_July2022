package com.chainsys.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ExampleThreads_1 {
	public static void main(String[] args) {

		String[] words = { "a", "b", "c", "a", "a", "r", "b", "c", "a" };

		SharedValue sharedValue = new SharedValue();

		for (int i = 0; i <= 6; i += 3) {
			Thread t = new Thread(new Worker(words, i, i + 2, "a", sharedValue));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
			}
			// we use t.join() to make sure that all threads complete before
			// printing the result
		}
		System.out.println(sharedValue.getContents());
		/*
		 * match found at index 0 match found at index 3 match found at index 4 match
		 * found at index 8 4
		 */
		System.exit(0);
	}
}

class Worker implements Runnable {

	private int i;
	private int j;
	private String[] values;
	private String key;
	private SharedValue sharedValue;

	public Worker(String[] values, int start, int stop, String key, SharedValue sharedValue) {
		this.i = start;
		this.j = stop;
		this.values = values;
		this.key = key;
		this.sharedValue = sharedValue;
	}

	@Override
	public void run() {
		for (; i <= j; i++) {
			if (values[i].equals(key)) {
				System.out.println("match found at index " + i);
				sharedValue.increment();
			}
		}
	}
}

class SharedValue {

	public static AtomicInteger number = new AtomicInteger(0);

	public AtomicInteger getContents() {
		return number;
	}

	public void increment() {
		number.incrementAndGet();
	}
}
