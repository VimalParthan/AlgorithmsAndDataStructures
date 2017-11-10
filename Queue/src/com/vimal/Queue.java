package com.vimal;

public class Queue <T extends Comparable<T>>{
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;
	
	public void enqueue(T data){
		if(data==null){
			return;
		}else if(size==0){
			this.firstNode = new Node<T>(data);
			this.lastNode = firstNode;
			size++;
		}else{
			this.lastNode.setNextNode(new Node<T>(data));
			this.lastNode=this.lastNode.getNextNode();
			size++;
		}
	}
	
	public T dequeue(){
		if(this.firstNode==null){
			return null;
		}else{
			size--;
			Node<T> temp = firstNode;
			this.firstNode = this.firstNode.getNextNode();
			if(this.size==1){
				this.firstNode=this.lastNode;
			}
			return temp.getData();
			
		}
	}
	
	public T peek(){
		return this.firstNode.getData();
	}
	
	public int size(){
		return this.size;
	}
	

}
