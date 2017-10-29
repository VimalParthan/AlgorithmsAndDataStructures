package com.vimal;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		if(this.root==null){
			this.root = new Node<T>(data); 
		}else{
			insertData(data,this.root);
		}
		
	}

	private void insertData(T data, Node<T> node) {
		if(data.compareTo(node.getData())<0){
			if(node.getLeftNode()!=null){
				insertData(data, node.getLeftNode());
			}else{
				node.setLeftNode(new Node<T>(data));
			}
		}else if(data.compareTo(node.getData())>0){
			if(node.getRightNode()!=null){
				insertData(data, node.getRightNode());
			}else{
				node.setRightNode(new Node<T>(data));
			}
		}
			
		
		
	}

	@Override
	public void delete(T data) {
		
		if(this.root==null){
			return;
		}else{
			this.root=delete(data,this.root);
		}
		
	}

	private Node<T> delete(T data, Node<T> node) {
		if(node==null) return node;
		if(data.compareTo(node.getData())<0){
			node.setLeftNode(delete(data, node.getLeftNode()));
		}else if(data.compareTo(node.getData())>0){
			node.setRightNode(delete(data, node.getRightNode()));
		}else{
			if(node.getLeftNode()==null&&node.getRightNode()==null){
				node=null;
				return node;
			}else if(node.getLeftNode()==null){
				Node<T> tempNode = node.getRightNode();
				node = null;
				return tempNode;
			}else if(node.getRightNode()==null){
				Node<T> tempNode = node.getLeftNode();
				node = null;
				return tempNode;
			}
			
			Node<T> tempNode = getPredecessor(node.getLeftNode());
			node.setData(tempNode.getData());
			node.setLeftNode(delete(node.getData(),node.getLeftNode()));
		}
		return node;
	}
	
	
	private Node<T> getPredecessor(Node<T> node){
		if(node.getRightNode()!=null)
			getPredecessor(node.getRightNode());
		
		return node;
	}

	@Override
	public T min() {
		if(this.root==null){
			return null;
		}else{
			return findMin(root).getData();
		}
	}

	private Node<T> findMin(Node<T> node) {
		if(node.getLeftNode()!=null)
			findMin(node.getLeftNode());
		
		return node;
		
	}

	@Override
	public T max() {
		if(this.root==null){
			return null;
		}else{
			return findMax(root).getData();
		}
	}

	private Node<T> findMax(Node<T> node) {
		if(node.getRightNode()!=null)
			findMax(node.getRightNode());
		
		return node;
	}

	@Override
	public void inorderTraversal() {
		
		if(root==null){
			return;
		}else{
			inorderTraversal(root);
		}
		
	}

	private void inorderTraversal(Node<T> node) {
		if(node.getLeftNode()!=null){
			inorderTraversal(node.getLeftNode());
		}
		System.out.println(node+"-->");
		if(node.getRightNode()!=null){
			inorderTraversal(node.getRightNode());
		}
		
	}

	@Override
	public void preOrdertraversal() {
		
		if(root==null){
			return;
		}else{
			preOrdertraversal(root);
		}
		
	}

	private void preOrdertraversal(Node<T> node) {
		
		System.out.println(node+"-->");
		if(node.getLeftNode()!=null){
			inorderTraversal(node.getLeftNode());
		}
		if(node.getRightNode()!=null){
			inorderTraversal(node.getRightNode());
		}
	
		
		
	
	
		
	}

	@Override
	public void postOrderTraversal() {

		if(root==null){
			return;
		}else{
			postOrderTraversal(root);
		}
		
	}

	private void postOrderTraversal(Node<T> node) {
	
		if(node.getLeftNode()!=null){
			inorderTraversal(node.getLeftNode());
		}
	
		if(node.getRightNode()!=null){
			inorderTraversal(node.getRightNode());
		}
		System.out.println(node+"-->");
	}


}
