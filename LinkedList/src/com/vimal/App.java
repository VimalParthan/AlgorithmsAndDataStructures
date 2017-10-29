package com.vimal;

public class App {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();

		list.insert("Java");
		list.insert("data-structures");
		list.insert("Algorithms");
		
		list.traverseList();
		
		list.remove("Algorithms");
		System.out.println("");
		list.traverseList();
	}
	

}
