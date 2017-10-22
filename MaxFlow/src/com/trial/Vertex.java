package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Edge> adjacentEdges;
	private int index;

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}

	public void addEdge(Edge edge) {
		this.adjacentEdges.add(edge);
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Vertex(String name,int index) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
		this.index = index;
	}
	
	

}
