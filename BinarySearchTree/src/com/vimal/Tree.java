package com.vimal;

public interface Tree<T extends Comparable<T>> {
	public void inorderTraversal();
	public void preorderTraversal();
	public void postorderTraversal();
	public void insert(T data);
	public void delete(T data);
	public T getMax();
	public T getMin();

}
