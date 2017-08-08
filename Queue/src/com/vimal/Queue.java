package com.vimal;

public class Queue<T extends Comparable<T>> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int queueSize;

	public boolean isEmpty() {
		return this.firstNode == null;
	}

	public int size() {
		return this.queueSize;
	}

	public void enqueue(T data) {
		this.queueSize++;

		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		this.lastNode.setNextNode(null);

		if (isEmpty()) {
			this.firstNode = this.lastNode;
		} else {
			oldLastNode.setNextNode(lastNode);
		}
	}

	public T dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			this.queueSize--;
			T dataToReturn = this.firstNode.getData();
			this.firstNode = this.firstNode.getNextNode();
			
			if(isEmpty())
				this.lastNode = null;
		
			return dataToReturn;	
		}
	}

}
