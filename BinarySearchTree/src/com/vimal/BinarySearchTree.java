package com.vimal;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	private void insertNode(T newData, Node<T> node) {
		if (newData.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null) {
				insertNode(newData, node.getLeftChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeftChild(newNode);
			}
		} else {
			if (node.getRightChild() != null) {
				insertNode(newData, node.getRightChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRightChild(newNode);
			}
		}

	}

	@Override
	public T getMin() {
		if (root == null)
			return null;

		return getMinValue(root);
	}

	private T getMinValue(Node<T> node) {
		if (node.getLeftChild() != null) {
			return getMinValue(node.getLeftChild());
		}

		return node.getData();
	}

	@Override
	public T getMax() {
		if (root == null)
			return null;

		return getMaxValue(root);
	}

	private T getMaxValue(Node<T> node) {

		if (node.getRightChild() != null) {
			return getMaxValue(node.getRightChild());
		}

		return node.getData();
	}

	@Override
	public void inorderTraversal() {
		if (this.root != null) {
			inorderTraversal(this.root);
		}
	}

	private void inorderTraversal(Node<T> node) {
		if (node.getLeftChild() != null) {
			inorderTraversal(node.getLeftChild());
		}

		System.out.print(node + " --> ");

		if (node.getRightChild() != null) {
			inorderTraversal(node.getRightChild());
		}
	}
	@Override
	public void preorderTraversal() {
		if (this.root != null) {
			preorderTraversal(this.root);
		}

	}
	
	private void preorderTraversal(Node<T> node) {

		System.out.print(node + " --> ");

		if (node.getLeftChild() != null) {
			preorderTraversal(node.getLeftChild());
		}

		if (node.getRightChild() != null) {
			preorderTraversal(node.getRightChild());
		}

	}

	@Override
	public void postorderTraversal() {
		if (this.root != null) {
			postorderTraversal(this.root);
		}
	}
	
	private void postorderTraversal(Node<T> node) {

		if (node.getLeftChild() != null) {
			postorderTraversal(node.getLeftChild());
		}

		if (node.getRightChild() != null) {
			postorderTraversal(node.getRightChild());
		}

		System.out.print(node + " --> ");
	}


	@Override
	public void delete(T data) {

		if (this.root != null)
			this.root = delete(this.root, data);

	}

	private Node<T> delete(Node<T> node, T data) {
		if (node == null)
			return node;
		//searching
		if (data.compareTo(node.getData()) < 0) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRightChild(delete(node.getRightChild(), data));
		} else {
			//after found
			if (node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Removing a leaf node ...");
				return null;
			}

			if (node.getLeftChild() == null) {
				System.out.println("removing the right child..");
				Node<T> tempNode = node.getRightChild();
				node = null;
				return tempNode;
			} else if (node.getRightChild() == null) {
				System.out.println("removing the left child..");
				Node<T> tempNode = node.getLeftChild();
				node = null;
				return tempNode;
			}else{
			
			System.out.println("Removing item with two children..");
			Node<T> tempNode = getPredecessor(node.getLeftChild());
			node.setData(tempNode.getData());
			node.setLeftChild(delete(node.getLeftChild(), tempNode.getData()));
			}
		}

		return node;

	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() != null)
			return getPredecessor(node.getRightChild());
		return node;
	}

}
