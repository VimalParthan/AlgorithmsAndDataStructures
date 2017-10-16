package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String data;
	private boolean visited;
	private List<Vertex> adjacentVertices;
	
	public Vertex(String data){
		this.data = data;
		this.adjacentVertices = new ArrayList<>();
	}

	public String getData() {
		return data;
	}

	public boolean isVisited() {
		return visited;
	}

	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}
	
	public void addVertex(Vertex vertex){
		this.adjacentVertices.add(vertex);
	}
	
	
	
	public void setData(String data) {
		this.data = data;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data;
	}
}
