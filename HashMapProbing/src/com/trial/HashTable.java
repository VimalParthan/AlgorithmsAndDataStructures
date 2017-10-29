package com.trial;

public class HashTable {
	
	private HashItem[] hashTable;
	
	public HashTable(){
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	
	
	public int get(int key){
		
		int generatedHashIndex = hash(key);
		
		while(hashTable[generatedHashIndex]!=null&&hashTable[generatedHashIndex].getKey()!=key){
			generatedHashIndex = (generatedHashIndex+1)%Constants.TABLE_SIZE;
		}
		
		if(hashTable[generatedHashIndex]==null){
			return -1;
		}else{
			return hashTable[generatedHashIndex].getValue();
		}
		
	}
	
	public void put(int key,int value){
		
		int hashIndex = hash(key);
		
		while(hashTable[hashIndex]!=null){
			hashIndex = (hashIndex+1)%Constants.TABLE_SIZE;
		}
		
		hashTable[hashIndex]=new HashItem(key, value);
		
	}
	
	private int hash(int key){
		return key%Constants.TABLE_SIZE;
	}

}
