package com.vimal;

public interface List<T extends Comparable<T>> {
	
	void insert(T data);
	
	void remove(T data);
	
	void traverseList();
	
	int listSize();
}
