package com.trial;

public class App {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.put(1,10);
		System.out.println();
		hashTable.put(2,100);
		System.out.println();
		hashTable.put(3,100);
		System.out.println();
		
		System.out.println(hashTable.get(1));
		

	}

}
