package com.vimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new LinkedList<Person>();
		
		Person p = new Person("Adam",10);
		list.insert(p);
		list.insert(new Person("Joe",10));
		list.insert(new Person("Kevin",1));
		list.insert(new Person("Micaheal",45));
		
		System.out.println(list.size());
		
		list.remove(p);
		
		list.traverseList();
	}

}
