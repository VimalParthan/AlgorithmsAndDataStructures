package com.trial;

public class Edge {
	
	private Vertex startingVertex;
	private Vertex endingVertex;
	private int weight;
	
	public Edge(int weight,Vertex startingVertex,Vertex endingVertex){
		this.weight = weight;
		this.startingVertex = startingVertex;
		this.endingVertex = endingVertex;
	}

	public Vertex getStartingVertex() {
		return startingVertex;
	}

	public void setStartingVertex(Vertex startingVertex) {
		this.startingVertex = startingVertex;
	}

	public Vertex getEndingVertex() {
		return endingVertex;
	}

	public void setEndingVertex(Vertex endingVertex) {
		this.endingVertex = endingVertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
