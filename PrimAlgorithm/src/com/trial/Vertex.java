package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentEdges;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}
	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	


}
