package kol.sas;

public interface Ram {

	default void  displayName(){
		System.out.println("ram");
	}
	
	static void displayAge(){
		System.out.println("15");
	}
}
