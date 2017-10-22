package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentEdges;
	private double distance =Double.MAX_VALUE;
	private boolean visited;
	private Vertex previousVertex;
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
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public Vertex getPreviousVertex() {
		return previousVertex;
	}
	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}
	public Vertex(String name) {
		
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	public void addNeighbour(Edge edge){
		this.adjacentEdges.add(edge);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	
	

}
