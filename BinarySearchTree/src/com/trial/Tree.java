package com.trial;

public interface Tree <T extends Comparable<T>> {
	public void insert(T data);
	public void delete(T data);
	public T min();
	public T max();
	public void inOrderTraversal();
	public void preOrderTraversal();
	public void postOrderTraversal();
}
