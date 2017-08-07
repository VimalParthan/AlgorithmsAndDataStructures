package com.practise;

public class Stack <T extends Comparable<T>> {

	private Node <T> root;
	private int sizeOfStack;
	
	public T pop(){
	
		if(isEmpty())return null;
		
		sizeOfStack--;
		T oldRootData = this.root.getData();
		this.root=this.root.getNextNode();
		return oldRootData;
	}
	
	public void push(T data){
		sizeOfStack++;
		if(this.root==null){
			this.root= new Node<>(data);
			return;
		}else{
			Node <T> newNode = new Node<>(data);
			newNode.setNextNode(this.root);
			this.root = newNode;
			return;
		}
	}
	
	public T peek(){
		return this.root.getData();
	}
	
	public int sizeOfStack(){
		return this.sizeOfStack;
	}
	
	public boolean isEmpty(){
		return this.root==null;
	}
}
