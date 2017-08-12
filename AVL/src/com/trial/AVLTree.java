package com.trial;

public class AVLTree <T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		this.root = insert(this.root,data);
		
	}
	
	
	
	private Node<T> insert (Node<T> node, T data){
		
		if(node==null){
			return new Node<T>(data);
		}
		
		if(data.compareTo(node.getData())<0){
			node.setLeftNode(insert(node.getLeftNode(),data));
		}else{
			node.setRightNode(insert(node.getRightNode(),data));
		}
		
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		
		node = settleViolation(node,data);
		
		return node;
	}
	
	private Node<T> settleViolation(Node<T> node,T data){
		
		int balance = getBalance(node);
		
		if(balance>1){
			if(data.compareTo(node.getLeftNode().getData())>0){
				node.setLeftNode(leftRotation(node.getLeftNode()));
			}
			
			return rightRotation(node);
		}
		
		if(balance<-1){
			if(data.compareTo(node.getRightNode().getData())<0){
				node.setRightNode(rightRotation(node.getRightNode()));
			}
			
			return leftRotation(node);
		}
		
		return node;
		
	}
	
	@Override
	public void delete(T data) {
		
		this.root = delete(this.root,data);
		
	}
	
	private Node<T> delete(Node<T> node,T data){
		
		if(node==null){
			return node;
		}
		
		if(data.compareTo(node.getData())<0){
			node.setLeftNode(delete(node.getLeftNode(), data));
		}else if(data.compareTo(node.getData())>0){
			node.setRightNode(delete(node.getRightNode(), data));
		}else{
			if(node.getLeftNode()==null&&node.getRightNode()==null){
				return null;
			}
			
			else if(node.getLeftNode()==null){
				Node<T> tempNode = node.getRightNode();
				node=null;
				return tempNode;
			}
			
			else if(node.getRightNode()==null){
				Node<T> tempNode = node.getLeftNode();
				node =null;
				return tempNode;
			}
			
			else {
				Node<T> tempNode = getPredecessor(node.getLeftNode());
				node.setData(tempNode.getData());
				tempNode.setLeftNode(delete(node.getLeftNode(),tempNode.getData()));
			}
			
		}
		
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		
		return settleDeleteViolation(node);
	}
	
	
	private Node<T> settleDeleteViolation(Node<T> node){
		
		int balance = getBalance(node);
		
		if(balance>1){
			if(getBalance(node.getLeftNode())<0){
				node.setLeftNode(leftRotation(node.getLeftNode()));
			}
			return rightRotation(node);
		}
		
		if(balance<-1){
			if(getBalance(node.getRightNode())>0){
				node.setRightNode(rightRotation(node.getRightNode()));
			}
			
			return leftRotation(node);
		}
		

		
		return node;
	}
	
	private Node<T> getPredecessor(Node<T> node){
		if(node.getRightNode()!=null){
			getPredecessor(node.getRightNode());
		}
		
		
		return node;
	}

	@Override
	public void traverse() {
			
		if(this.root==null){
			return;
		}else{
			inOrderTraversal(this.root);
		}
		
	}
	
	private void inOrderTraversal(Node<T> node){
		if(node.getLeftNode()!=null){
			inOrderTraversal(node.getLeftNode());
		}
		
		System.out.println(node);
		
		if(node.getRightNode()!=null){
			inOrderTraversal(node.getRightNode());
		}
	}
	
	private Node<T> leftRotation(Node<T> node){
		Node<T> tempRightNode = node.getRightNode();
		Node<T> t = tempRightNode.getLeftNode();
		
		tempRightNode.setLeftNode(node);
		node.setRightNode(t);
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		tempRightNode.setHeight(Math.max(height(tempRightNode.getLeftNode()),height( tempRightNode.getRightNode()))+1);
		
		
		return tempRightNode;
	}
	
	private Node<T> rightRotation(Node<T> node){
		Node<T> tempLeftNode = node.getLeftNode();
		Node<T> t = tempLeftNode.getRightNode();
		
		tempLeftNode.setRightNode(node);
		node.setLeftNode(t);
		
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftNode()), height(tempLeftNode.getRightNode()))+1);
		
		
		return tempLeftNode;
	}
	
	private int getBalance(Node<T> node){
		
		if(node==null){
			return 0;
		}
		return height(node.getLeftNode())-height(node.getRightNode());
				
	}

	private int height(Node<T> node){
		if(node==null){
			return -1;
		}
		
		return node.getHeight();
	}

}
