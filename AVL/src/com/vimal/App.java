package com.vimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<Integer> avl = new AVLTree<>();
		avl.insert(10);
		avl.insert(15);
		avl.insert(5);
		avl.insert(14);
		avl.insert(13);
		avl.insert(89);
		avl.insert(1022);
		avl.insert(121312);
		avl.insert(142312);
		avl.insert(1332132);
		avl.insert(8321321);
		avl.insert(1022454354);
		avl.insert(1213123432);
		
		avl.traverse();
		
		avl.delete(5);
		
		avl.traverse();
		
	}

}
