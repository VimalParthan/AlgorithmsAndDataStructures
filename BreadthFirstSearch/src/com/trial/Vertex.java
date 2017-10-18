package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean visited;
	private List<Vertex> adjacentVertices;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentVertices = new ArrayList<>();
	}
	
	public void addVertex(Vertex vertex){
		this.adjacentVertices.add(vertex);
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}

	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}
	

}
