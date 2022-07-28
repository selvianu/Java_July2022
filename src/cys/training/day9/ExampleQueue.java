package cys.training.day9;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ExampleQueue {

	public static void main(String[] args) {

		PriorityQueue pQueue = new PriorityQueue();

		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		System.out.println(pQueue);
		System.out.println("Peek of queue : " + pQueue.peek());

		System.out.println("poll of queue" + pQueue.poll());
		System.out.println(pQueue);
		System.out.println("Peek of queue" + pQueue.peek());

		/*
		 * ArrayDeque class which is implemented in the collection framework provides us
		 * with a way to apply resizable-array. This is a special kind of array that
		 * grows and allows users to add or remove an element from both sides of the
		 * queue.
		 */

		ArrayDeque deque = new ArrayDeque(10);

		// add() method to insert
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);

		System.out.println("Array Deque : " + deque);

		// clear() method
		deque.clear();

		// addFirst() method to insert the
		deque.addFirst(564);
		deque.addFirst(291);

		// addLast() method to insert the
		deque.addLast(24);
		deque.addLast(14);

		System.out.println(deque);
	}
}
