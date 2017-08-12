package com.vimal;

public interface Tree <T extends Comparable<T>>{
	public void insert(T data);
	public void traverse();
	public void delete(T data);
}
