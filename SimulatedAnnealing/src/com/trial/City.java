package com.trial;

public class City {
	
	private int x;
	private int y;
	
	public City(){
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
	}
	
	public City(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public double ditanceTo(City otherCity){
		int xCo = Math.abs(x-otherCity.getX());
		int yCo = Math.abs(y-otherCity.getY());
		
		double distance = Math.sqrt((xCo*xCo)+(yCo*yCo));
		
		return distance;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.x+"-"+this.y;
	}
}
