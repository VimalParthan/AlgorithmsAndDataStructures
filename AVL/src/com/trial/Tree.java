package com.trial;

public interface Tree <T extends Comparable<T>>{
	public void insert(T data);
	public void delete(T data);
	public void traverse();
}
