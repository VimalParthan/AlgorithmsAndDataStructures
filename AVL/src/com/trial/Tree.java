package com.trial;

public interface Tree <T extends Comparable<T>> {
	
	void insert(T data);
	void delete(T data);
	void traverse();

}
