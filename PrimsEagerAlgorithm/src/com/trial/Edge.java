package com.trial;

public class Edge {
	
	private Vertex startVertex;
	private Vertex targetVertex;
	private double weight;
	public Vertex getStartVertex() {
		return startVertex;
	}
	public Vertex getTargetVertex() {
		return targetVertex;
	}
	public double getWeight() {
		return weight;
	}
	public Edge(Vertex startVertex, Vertex targetVertex, double weight) {
		super();
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.weight = weight;
	}
	
	

}
