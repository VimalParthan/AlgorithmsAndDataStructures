package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Vertex> adjacentVertices;
	private boolean visited;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}
	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentVertices =new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public void addVertex(Vertex vertex){
		this.adjacentVertices.add(vertex);
	}
	

}
