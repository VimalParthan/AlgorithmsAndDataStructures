package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private List<Edge> adjacentEdges;
	private Edge minEdge;
	private double distance=Double.POSITIVE_INFINITY;
	private boolean visited;
	
	
	
	public String getName() {
		return name;
	}
	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}
	public Edge getMinEdge() {
		return minEdge;
	}
	public double getDistance() {
		return distance;
	}
	
	@Override
	public String toString() {	
		return this.name;
	}
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	
	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}
	@Override
	public int compareTo(Vertex o) {
		// TODO Auto-generated method stub
		return Double.compare(this.distance, o.getDistance());
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}
	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}


}
