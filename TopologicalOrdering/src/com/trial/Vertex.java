package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Vertex> adjacentList;
	private boolean visited;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vertex> getAdjacentList() {
		return adjacentList;
	}
	public void setAdjacentList(List<Vertex> adjacentList) {
		this.adjacentList = adjacentList;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public void addNeighbour(Vertex vertex){
		adjacentList.add(vertex);
	}
	
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentList = new ArrayList<>();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
