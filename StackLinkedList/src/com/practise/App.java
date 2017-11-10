package com.practise;
public class App {
	public static void main(String[] args) {
	
		Stack <String> st = new Stack<String>();
		st.push("hey");
		st.push("hello");
		st.push("howdy");
		
		System.out.println(st.sizeOfStack());
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		

		
	}
}
