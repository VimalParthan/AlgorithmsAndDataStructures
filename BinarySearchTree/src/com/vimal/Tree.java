package com.vimal;

public interface Tree <T extends Comparable<T>>{
	
	void insert(T data);
	void delete(T data);
	T min();
	T max();
	void inorderTraversal();
	void preOrdertraversal();
	void postOrderTraversal();
}
