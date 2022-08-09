package com.chainsys.thread;

/*
 * Returning values using Thread or Runnable is not straightforward. 
 * One way is controlling the threads execution by using wait() and notify() methods
 */

public class ReturnThread {

	public static void main(String[] args) throws InterruptedException {

		MyTask3 task1 = new MyTask3(200l);
		Thread t1 = new Thread(task1);
		t1.start();
t1.join();
		MyTask3 task2 = new MyTask3(10000l);
		Thread t2 = new Thread(task2);
		t2.start();
	//	t1.join(300l);
		

		// if task1 is still executing, then it puts the caller thread [main] to wait
		// when it finishes, then notify() is called to wake up the caller thread
		// same for task 2
		System.out.println("Sum: " + task1.getSum());
		System.out.println("Sum: " + task2.getSum());
	}
}

class MyTask3 implements Runnable {
	private Long sleep;
	private int sum;
	private boolean done = false;

	public MyTask3(Long sleep) {
		this.sleep = sleep;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
			this.sum += i;
			try {
				Thread.sleep(sleep);
							} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		done = true;
		this.notify();
	}

	public int getSum() throws InterruptedException {
		if (!done) {
			System.out.println(Thread.currentThread().getName() + " is waiting");
			this.wait();
		}

		return this.sum;
	}
}