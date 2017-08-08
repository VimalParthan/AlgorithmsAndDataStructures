package com.trial;

import org.omg.CosNaming.IstringHelper;

public class Queue <T extends Comparable<T>>{
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	public boolean isEmpty(){
		return this.firstNode==null;
	} 
	
	public int size(){
		return this.count;
	}
	
	public void enqueue(T data){
		count++;
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		this.lastNode.setNextNode(null);
		if(isEmpty()){
			this.firstNode = this.lastNode;
		}else{
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	public T dequeue(){
		count--;
		
		T dataToReturn = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		if(isEmpty()){
			this.lastNode =null;
		}
		
		return dataToReturn;
	}

}
