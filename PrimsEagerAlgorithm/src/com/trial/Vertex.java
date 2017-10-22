package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private Edge minEdge;
	private double distance = Double.POSITIVE_INFINITY;
	private List<Edge> adjacentEdges;
	private boolean visited;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Edge getMinEdge() {
		return minEdge;
	}
	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
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
	public Vertex(String name) {
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	@Override
	public String toString() {
		return this.name;
	}
	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	@Override
	public int compareTo(Vertex o) {
		// TODO Auto-generated method stub
		return Double.compare(this.distance, o.getDistance());
	}
	
	

}
