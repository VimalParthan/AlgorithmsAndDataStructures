package com.vimal;



public class JavaQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> myQueue = new Queue<Integer>();
		
		myQueue.enqueue(10);
		myQueue.enqueue(100);
		myQueue.enqueue(1000);
		System.out.println(myQueue.size());
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.size());
	}

}
