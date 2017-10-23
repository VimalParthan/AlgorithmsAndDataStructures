package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private List<Edge> adjacentEdges;
	private double distance=Integer.MAX_VALUE;
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
	
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public void addNeighbour(Edge edge){
		this.adjacentEdges.add(edge);
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	@Override
	public int compareTo(Vertex o) {
		return Double.compare(this.distance, o.getDistance());
	}
	public Vertex getPreviousVertex() {
		return previousVertex;
	}
	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}
	
	

}
