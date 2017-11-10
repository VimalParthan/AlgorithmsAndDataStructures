package com.vimal;

public class Stack <T extends Comparable<T>>{
	
	private Node<T> root;
	private int size;


	
	public Stack(){
		
	}
	
	public void push(T data){
		
		if(data==null){
			return;
		}else if(this.root==null){
			this.root= new Node<T>(data);
			size++;
		}else{
			Node<T> temp = this.root; 
			this.root = new Node<T>(data);
			this.root.setNextNode(temp);
			size++;
		}
	}
	
	public T pop(){
		if(this.root==null){
			return null;
		}else{
			Node<T> temp = this.root;
			this.root=this.root.getNextNode();
			return temp.getData();
		}
	}
	
	public T peek(){
		return this.root.getData();
	}
	
	public int size(){
		return this.size;
	}

}
