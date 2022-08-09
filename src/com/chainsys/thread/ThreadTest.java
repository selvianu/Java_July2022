package com.chainsys.thread;

import java.lang.Thread.State;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		AThread t1 = new AThread();
		
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		
		AThread t2 = new AThread();
		System.out.println(t1.getState());
		t1.start();
		State state = t1.getState();
		System.out.println(state);
		System.out.println("Is is interrupted ? :" + t1.interrupted());

		System.out.println(t1.getState());
		try {
			t1.sleep(5000);
			

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		t1.join();

		System.out.println(t1.getState());

	}

}
