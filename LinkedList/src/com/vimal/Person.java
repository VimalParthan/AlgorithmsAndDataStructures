package com.vimal;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
	
		if(Integer.compare(this.age, person.getAge())==0&&this.name.equals(person.name)){
			return 0;
		} else{
			return 1;
		}
	}
	
	
}
