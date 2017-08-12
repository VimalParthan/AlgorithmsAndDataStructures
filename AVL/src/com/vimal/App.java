package com.vimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<Integer> avl = new AVLTree<>();
		avl.insert(10);
		avl.insert(15);
		avl.insert(5);
		avl.insert(14);
		
		avl.traverse();
		
		avl.delete(5);
		
		avl.traverse();
		
	}

}
