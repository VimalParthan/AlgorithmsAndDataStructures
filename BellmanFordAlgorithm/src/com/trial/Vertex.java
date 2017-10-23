package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentEdges;
	private double distance= Double.MAX_VALUE;
	private Vertex parentVertex;
	
	@Override
	public String toString() {
		return this.name;
	}
	

	public Vertex getParentVertex() {
		return parentVertex;
	}


	public void setParentVertex(Vertex parentVertex) {
		this.parentVertex = parentVertex;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}

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
	
	
	public void addNeighbour(Edge edge){
		this.adjacentEdges.add(edge);
	}
}
