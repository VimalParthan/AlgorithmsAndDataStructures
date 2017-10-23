package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentEdges;
	private int index;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}
	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}
	public Vertex(String name,int index) {
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
		this.index = index;
	}
	
	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}
	@Override
	public String toString() {

		return this.name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

}
