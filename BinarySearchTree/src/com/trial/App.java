package com.trial;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<Integer> myTree = new BinarySearchTree<>();
		myTree.insert(10);
		myTree.insert(9);
		myTree.insert(256);
		myTree.insert(2);
		myTree.insert(56);
		myTree.insert(3);
		myTree.insert(12);
		myTree.insert(23);
		myTree.insert(9);
	
		
		myTree.inOrderTraversal();
		System.out.println("");
		myTree.preOrderTraversal();
		System.out.println("");
		myTree.postOrderTraversal();
		System.out.println("");
		System.out.println(myTree.max());
		System.out.println(myTree.min());
		
		myTree.delete(10);
		myTree.inOrderTraversal();
 	}

}
