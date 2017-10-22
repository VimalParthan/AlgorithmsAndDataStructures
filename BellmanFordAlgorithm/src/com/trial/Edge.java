package com.trial;

public class Edge {
	
	private Vertex startVertex;
	private Vertex targetVertes;
	private double weight;
	public Vertex getStartVertex() {
		return startVertex;
	}
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}
	public Vertex getTargetVertes() {
		return targetVertes;
	}
	public void setTargetVertes(Vertex targetVertes) {
		this.targetVertes = targetVertes;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Edge(Vertex startVertex, Vertex targetVertes, double weight) {
		super();
		this.startVertex = startVertex;
		this.targetVertes = targetVertes;
		this.weight = weight;
	}
	
	

}
