package com.trial;

public class AVLTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		this.root= insert(this.root,data);
		
	}

	private Node<T> insert(Node<T> node, T data) {
		if(node==null){
			node=new Node<T>(data);
		}else if(data.compareTo(node.getData())<0){
			node.setLeftNode(insert(node.getLeftNode(),data));
		}else if(data.compareTo(node.getData())>0){
			node.setRightNode(insert(node.getRightNode(), data));
		}
		
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		
		return settleViolation(node,data);
		
	}

	private Node<T> settleViolation(Node<T> node,T data) {
		int balance = balance(node);
		
		if(balance>1&&data.compareTo(node.getLeftNode().getData())<0){
			return rightRotate(node);
		}else if(balance<-1&&data.compareTo(node.getRightNode().getData())>0){
			return leftRotate(node);
		}else if(balance>1&&data.compareTo(node.getLeftNode().getData())>0){
			node.setLeftNode(leftRotate(node.getLeftNode()));
			return rightRotate(node);
		}else if(balance<-1&&data.compareTo(node.getRightNode().getData())<0){
			node.setRightNode(rightRotate(node.getRightNode()));
			return leftRotate(node);
		}
		
		return node;
	}

	private Node<T> rightRotate(Node<T> node) {
		Node<T> tempNode = node.getLeftNode();
		Node<T> leftRightNode = tempNode.getRightNode();
		
		tempNode.setRightNode(node);
		node.setLeftNode(leftRightNode);
		
		tempNode.setHeight(Math.max(height(tempNode.getLeftNode()), height(tempNode.getRightNode()))+1);
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		
		return tempNode;
	}
	
	private Node<T> leftRotate(Node<T> node) {
		Node<T> tempNode = node.getRightNode();
		Node<T> rightLeftNode = tempNode.getLeftNode();
		
		tempNode.setLeftNode(node);
		node.setRightNode(rightLeftNode);
		
		tempNode.setHeight(Math.max(height(tempNode.getLeftNode()), height(tempNode.getRightNode()))+1);
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		
		return tempNode;
	}

	private int balance(Node<T> node) {
		
		if(node==null){
			return 0;
		}
		
		return height(node.getLeftNode())-height(node.getRightNode());
	}

	private int height(Node<T> node) {
		if(node==null){
			return -1;
		}
		
		return node.getHeight();
	}

	@Override
	public void delete(T data) {
		this.root= delete(this.root,data);
		
	}

	private Node<T> delete(Node<T> node, T data) {
		if(node==null){
			return node;
		}else if(data.compareTo(node.getData())<0){
			node.setLeftNode(delete(node.getLeftNode(), data));
		}else if(data.compareTo(node.getData())>0){
			node.setRightNode(delete(node.getRightNode(),data));
		}else{
			if(node.getLeftNode()==null&&node.getRightNode()==null){
				return null;
			}else if(node.getLeftNode()==null){
				Node<T> tempNode = node.getLeftNode();
				node=null;
				return tempNode;
			}else if(node.getRightNode()==null){
				Node<T> tempNode = node.getRightNode();
				node=null;
				return tempNode;
			}else{
				
				Node<T> tempNode = getPredecessor(node.getLeftNode());
				node.setData(tempNode.getData());
				node.setLeftNode(delete(node.getLeftNode(),node.getData()));
				
			}

		}
		
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		return settleDeletion(node);
	}

	private Node<T> settleDeletion(Node<T> node) {
		int balance = balance(node);
		if(balance>1){
			if(balance(node.getLeftNode())<0){
				node.setLeftNode(leftRotate(node.getLeftNode()));
			}
			return rightRotate(node);
		}else if(balance<-1){
			if(balance(node.getRightNode())>0){
				node.setRightNode(rightRotate(node.getRightNode()));
			}
			return leftRotate(node);
		}
		
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if(node.getRightNode()!=null){
			getPredecessor(node);
		}
		return node;
	}

	@Override
	public void traverse() {
		
		inorderTraversal(this.root);
		
	}

	private void inorderTraversal(Node<T> node) {
		
		
		if(node.getLeftNode()!=null){
			inorderTraversal(node.getLeftNode());
		}
		System.out.println(node);
		
		if(node.getRightNode()!=null){
			inorderTraversal(node.getRightNode());
		}
	}



}
