package com.chainsys.thread;
//ex1
public class AThread extends Thread {

	int arr[] = { 4, 3, 0, 5, 2 };

	public void run() {

		for (int i = 0; i < 5; i++) {
			arr[i] = arr[i] * 2;
			System.out.println(arr[i]);
			
		}
	}

}
