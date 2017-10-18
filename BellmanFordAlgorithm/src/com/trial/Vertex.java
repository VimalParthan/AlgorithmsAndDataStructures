package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private double distance = Double.MAX_VALUE;
	private List<Edge> adjacentEdges;
	private Vertex previousVertex;
	
	public Vertex(String name){
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	
	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}
	
	@Override
	public String toString() {
	
		return this.name;
	}
	
	

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}

	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}
	
	

}
