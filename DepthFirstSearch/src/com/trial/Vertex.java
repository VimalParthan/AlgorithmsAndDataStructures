package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String data;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex(String data) {

		this.data = data;
		this.adjacencyList = new ArrayList<>();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	public void addVertex(Vertex vertex){
		this.adjacencyList.add(vertex);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data;
	}
}
