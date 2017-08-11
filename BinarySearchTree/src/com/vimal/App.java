package com.vimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<Person> bst = new BinarySearchTree<>();
		
		bst.insert(new Person("Adam",27));
		bst.insert(new Person("Veena",27));
		bst.insert(new Person("Joe",27));
		bst.insert(new Person("Michael",27));
		bst.insert(new Person("Smith",27));
		bst.insert(new Person("vimal",27));
		
		bst.inorderTraversal();
	}

}
