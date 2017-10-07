package com.vimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree<Integer> splayTree = new SplayTree<>();
		
		splayTree.insert(10);
		splayTree.printRoot();
		splayTree.insert(-5);
		splayTree.printRoot();
		splayTree.insert(0);
		splayTree.printRoot();
		splayTree.insert(20);
		splayTree.printRoot();
		splayTree.insert(30);
		
		splayTree.printRoot();
		
		System.out.println(splayTree.getMax());
		
		splayTree.inOrderTraversal();
		
		splayTree.find(-5);
		
		splayTree.printRoot();
			}

}
