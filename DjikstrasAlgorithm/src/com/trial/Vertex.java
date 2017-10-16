package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private List<Edge> adjacentEdges;
	private Vertex predecessor;
	private int distance = Integer.MAX_VALUE;
	
	public Vertex (String name){
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public int getDistance() {
		return distance;
	}
	
	public void addNeighbour(Edge edge){
		this.adjacentEdges.add(edge);
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int compareTo(Vertex vertex) {
		// TODO Auto-generated method stub
		return this.distance-vertex.getDistance();
	}
	
	

}
