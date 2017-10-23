package com.trial;

public class Edge {
	
	private Vertex startVertex;
	private Vertex targetVertex;
	private double weight;
	
	public Vertex getStartVertex() {
		return startVertex;
	}
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}
	public Vertex getTargetVertex() {
		return targetVertex;
	}
	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Edge(double weight,Vertex startVertex, Vertex targetVertex) {

		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.weight = weight;
	}

}
