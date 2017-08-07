package com.trial.one;

public class LinkedList <T extends Comparable<T>> implements List<T>{
	
	private Node<T> root;
	private int sizeOfList;
	
	
	@Override
	public void insert(T data) {
		++this.sizeOfList;
		
		if(this.root==null){
			this.root = new Node<T>(data);
		}else{
			insertNodeAtStart(data);
		}
		
	}
	
	private void insertNodeAtStart(T data){
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
		
	}
	
	private void insertNodeAtEnd(T data,Node<T> node){
		if(node.getNextNode()!=null){
			insertNodeAtEnd(data, node.getNextNode());
		}else{
			node.setNextNode(new Node<T>(data));
		}
	}

	@Override
	public void remove(T data) {
		if(this.root==null) return;
		--this.sizeOfList;
		if(this.root.getData().compareTo(data)==0){
			this.root = this.root.getNextNode();
		}else{
			remove(data,root,root.getNextNode());
		}
		
	}

	private void remove(T dataToRemove,Node<T> previousNode,Node<T>currentNode){
		while(currentNode!=null){
			if(currentNode.getData().compareTo(dataToRemove)==0){
				previousNode.setNextNode(currentNode.getNextNode());
				currentNode=null;
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
	}
	
	@Override
	public void traverseList() {
		if(this.root==null) return;
		Node<T> currentNode = this.root;
		while(currentNode!=null){
			System.out.print(currentNode.getData()+" -> ");
			currentNode=currentNode.getNextNode();
		}
		
	}

	@Override
	public int listSize() {
		
		return this.sizeOfList;
	}

}
