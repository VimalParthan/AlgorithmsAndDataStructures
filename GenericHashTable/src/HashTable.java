@SuppressWarnings("unchecked")
public class HashTable<Key,Value> {
	
	private Key[] keys;
	private Value[] values;
	private int numOfItems;
	private int capacity;
	
	
	public HashTable(){
		
		this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
		this.values = (Value[])new Object[Constants.TABLE_SIZE];
		this.capacity =Constants.TABLE_SIZE;
		this.numOfItems=0;
	
	}
	
	public HashTable(int newCapacity){
		
		this.keys = (Key[]) new Object[newCapacity];
		this.values = (Value[])new Object[newCapacity];
		this.capacity =newCapacity;
		this.numOfItems=0;
	
	}
	
	public int size(){
		return this.numOfItems;
	}
	
	public boolean isEmpty(){
		return this.numOfItems==0;
	}
	
	public void remove(Key key){
		if(key==null) return;
		
		int index = hash(key);
		
		while(keys[index]!=null&&!keys[index].equals(key)){
			index=(index+1)%capacity;
		}
		
		keys[index]=null;
		values[index]=null;
		
		index = (index+1)%capacity;
		
		while(keys[index]!=null){
			Key tempKey=keys[index];
			Value tempValue = values[index];
			keys[index]=null;
			values[index]=null;
			
			numOfItems--;
			put(tempKey,tempValue);
				
			index=(index+1)%capacity;
		}
	
		numOfItems--;
		if(numOfItems<=capacity/3){
			System.out.println("halfing the size.....");
			resize(capacity/2);
		}
	}
	
	private void resize(int newCapacity) {
		
		HashTable<Key, Value> newTable = new HashTable<>(newCapacity);
		
		for(int i=0;i<capacity;i++){
			if(keys[i]!=null){
				newTable.put(keys[i], values[i]);
			}
		}
		
		keys = newTable.getKeys();
		values = newTable.getValues();
		capacity=newTable.getCapacity();
		
		System.out.println("capacity now is: " +capacity);
		
	}
	
	

	public void put(Key key,Value value){
		
		if(key==null||value==null) return;
		
		if(numOfItems>=capacity*0.75){
			System.out.println("Doubling the size of the hashtable");
			resize(2*capacity);
		}
		
		int index = hash(key);
		
		while(keys[index]!=null){
			index=(index+1)%capacity;
			if(keys[index]!=null&&keys[index].equals(key)&&values[index]!=null){
				values[index]=value;
				return;
			}
			
		}
		
		keys[index]=key;
		values[index]=value;
		numOfItems++;
		
	}
	
	public Value get(Key key){
		if(key==null)return null;
		
		int index = hash(key);
		
		while(keys[index]!=null){
			if(keys[index].equals(key)){
				return values[index];
			}
			
			index = (index+1)%capacity;
		}
		
		return null;
	
	}
	
	private int hash(Key key){
		return Math.abs(key.hashCode())%capacity;
	}

	public Key[] getKeys() {
		return keys;
	}

	public void setKeys(Key[] keys) {
		this.keys = keys;
	}

	public Value[] getValues() {
		return values;
	}

	public void setValues(Value[] values) {
		this.values = values;
	}

	public int getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
