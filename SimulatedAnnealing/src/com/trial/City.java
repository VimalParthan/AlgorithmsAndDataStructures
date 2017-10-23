package com.trial;

public class City {

	private int x;
	private int y;

	public City(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public City() {
		this.x = (int) (Math.random() * 100);
		this.y = (int) (Math.random() * 100);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distanceTo(City otherCity){
		int xDistance =Math.abs(this.x-otherCity.getX());
		int yDistance =Math.abs(this.y-otherCity.getY());
		
		return Math.sqrt((xDistance*xDistance)+(yDistance*yDistance));
	}

	@Override
	public String toString() {
		return this.x+"-"+this.y;
	}
}
