package com.vimal;

public class App {
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		myStack.push("Vimal");
		myStack.push("Shammal");
		myStack.push("Aromal");
		System.out.println(myStack.size());
		
		System.out.println(myStack.peek());
		
		System.out.println(myStack.pop());

		System.out.println(myStack.pop());
	
		System.out.println(myStack.pop());
	
	}
}
