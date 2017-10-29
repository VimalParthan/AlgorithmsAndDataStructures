package com.vimal;

public class LinkedList<T extends Comparable<T>> implements List<T>{
	
	private Node<T> root;
	private int listSize;
	
	
	@Override
	public void insert(T data) {
		
		if(data==null)return;
		
		listSize++;
		if(this.root==null){
			root=new Node<T>(data,null);
		}else{
			insertAtStart(data);
		}
		
	}

	private void insertAtStart(T data) {
		
		Node<T> newNode = new Node<T>(data,root);
		this.root = newNode;
		
	}

	@Override
	public void remove(T data) {
		
		if(data==null)return;
		
		
		if(root.getData().compareTo(data)==0){
			this.root=root.getNextNode();
			listSize--;
		}else{
			remove(data,root,root.getNextNode());
		}
		
	}

	private void remove(T data,Node<T>previousNode, Node<T> currentNode) {
		if(currentNode==null)return;
		
		while(currentNode!=null){
			
			if(currentNode.getData().compareTo(data)==0){
				previousNode.setNextNode(currentNode.getNextNode());
				listSize--;
			}
			previousNode = currentNode;
			currentNode=currentNode.getNextNode();
		}
		
	}

	@Override
	public void traverseList() {
		Node<T> tempNode = root;
		while(tempNode!=null){
			System.out.println(tempNode);
			tempNode= tempNode.getNextNode();
		}
		
	}

	@Override
	public int listSize() {
		return listSize;
	}
	
	

}
