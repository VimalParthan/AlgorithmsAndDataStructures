package com.trial;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithm algorithm = new Algorithm();
		algorithm.interpretExpression("( ( ( 1 + 2 ) * ( ( 4 / 2 ) * ( 5 - 2 ) ) ) * ( 2 + 1 ) )");
		algorithm.result();
	}

}
