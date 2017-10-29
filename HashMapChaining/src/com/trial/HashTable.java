package com.trial;

public class HashTable {
	
	private HashItem [] hashTable;

	public HashTable() {

		this.hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	
	public void put(int key,int value){
		
		int hashArrayIndex = hash(key);
		
		if(hashTable[hashArrayIndex]==null){
			hashTable[hashArrayIndex]=new HashItem(key, value);
		}else{
			HashItem hashItem = hashTable[hashArrayIndex];
			
			while(hashItem.getNextHashItem()!=null){
				hashItem=hashItem.getNextHashItem();
			}
			
			hashItem.setNextHashItem(new HashItem(key, value));
		}
		
	}
	
	public int get(int key){
		
		int generatedHashIndex= hash(key);
		
		HashItem hashItem = hashTable[generatedHashIndex];
		
		if(hashItem==null){
			return -1;
		}
		
		
		while(hashItem!=null&&hashItem.getKey()!=key){
			hashItem = hashItem.getNextHashItem();
		}
		
		if(hashItem==null){
			return -1;
		}else{
			return hashItem.getValue();
		}
		
		
	}
	
	
	public int hash(int key){
		return key%Constants.TABLE_SIZE;
	}

}
