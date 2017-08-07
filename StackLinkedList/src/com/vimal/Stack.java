package com.vimal;

public class Stack <T extends Comparable<T>>{

		private Node<T> root;
		private int count;
		
		public void push(T newData){
			this.count++;
			if(this.root == null){
				this.root = new Node<>(newData);
			}else{
				Node<T> newNode = new Node<T>(newData);
				newNode.setNextNode(this.root);
				this.root = newNode;
			}
		}
		
		public T pop(){
			T itemToPop = this.root.getData();
			this.root = this.root.getNextNode();
			this.count--;
			return itemToPop;
		}
		
		public T peek(){
			return this.root.getData();
		}
		
		public int size(){
			return this.count;
		}
		
		public boolean isEmpty(){
			return this.root== null;
		}
}
