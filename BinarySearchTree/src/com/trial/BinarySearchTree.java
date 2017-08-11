package com.trial;


public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void insert(T data) {
		if (this.root == null) {
			this.root = new Node<T>(data);
		} else {
			insert(data, this.root);
		}

	}

	private void insert(T data, Node<T> node) {
		if (data.compareTo(node.getData()) < 0) {
			if (node.getLeftNode() != null) {
				insert(data, node.getLeftNode());
			} else {
				node.setLeftNode(new Node<T>(data));

			}
		} else if (data.compareTo(node.getData()) > 0) {
			if (node.getRightNode() != null) {
				insert(data, node.getRightNode());
			} else {
				node.setRightNode(new Node<T>(data));

			}
		}
	}

	@Override
	public void delete(T data) {
		if(this.root!=null){
			this.root = delete(data,this.root);
		}

	}
	
	
	
	private Node<T> delete(T data,Node<T> node){
		if(node==null)return node;
		if(data.compareTo(node.getData())<0){
			node.setLeftNode(delete(data,node.getLeftNode()));
		}
		else if(data.compareTo(node.getData())>0){
			node.setRightNode(delete(data, node.getRightNode()));
		}else{
			if(node.getLeftNode()==null&&node.getLeftNode()==null){
				System.out.println("removing leaf node");
				node =null;
				return node;
			}else if(node.getLeftNode()==null){
				System.out.println("removing node with right node");
				Node<T> tempNode = node.getRightNode();
				node = null;
				return tempNode;
			}else if(node.getRightNode()==null){
				System.out.println("removing node with left node");
				Node<T> tempNode = node.getLeftNode();
				node= tempNode;
				return tempNode;
			}
			System.out.println("removing node with two nodes");
			Node<T> tempNode = getPredecessor(node.getLeftNode());
			node.setData(tempNode.getData());
			node.setLeftNode(delete(node.getData(), node.getLeftNode()));
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
	public void inOrderTraversal() {
		if(this.root!=null){
			inOrderTraversal(this.root);
		}
	}
	
	private void inOrderTraversal(Node<T> node){
		
		if(node.getLeftNode()!=null){
			inOrderTraversal(node.getLeftNode());
		}
		System.out.print(node.getData()+"-->");
		if(node.getRightNode()!=null){
			inOrderTraversal(node.getRightNode());
		}
		
	}
	
	

	@Override
	public void preOrderTraversal() {
		if(this.root!=null){
			preOrderTraversal(this.root);
		}

	}
	

	private void preOrderTraversal(Node<T> node){
		
		System.out.print(node.getData()+"-->");
		if(node.getLeftNode()!=null){
			preOrderTraversal(node.getLeftNode());
		}
		
		if(node.getRightNode()!=null){
			preOrderTraversal(node.getRightNode());
		}
		
	}

	@Override
	public void postOrderTraversal() {
		if(this.root!=null){
			postOrderTraversal(this.root);
		}

	}
	
	

	private void postOrderTraversal(Node<T> node){
		
		
		if(node.getLeftNode()!=null){
			postOrderTraversal(node.getLeftNode());
		}
		
		if(node.getRightNode()!=null){
			postOrderTraversal(node.getRightNode());
		}
		System.out.print(node.getData()+"-->");
		
	}

	@Override
	public T min() {
		if(this.root ==null) return null;
		
		return min(this.root);
	}
	
	private T min(Node<T> node){
		if(node.getLeftNode()!=null){
		 return	min(node.getLeftNode());
		} 
		
		return node.getData();
	}

	@Override
	public T max() {
		if(this.root ==null) return null;
		
		return max(this.root);
	}
	
	private T max(Node<T> node){
		if(node.getRightNode()!=null){
			return max(node.getRightNode());
		} 
		
		return node.getData();
	}

}
