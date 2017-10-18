package com.trial;

public class Edge {
	
	private Vertex startVertex;
	private Vertex targetvertex;
	private double weight;
	
	public Edge(Vertex startVertex, Vertex targetvertex, double weight) {
		super();
		this.startVertex = startVertex;
		this.targetvertex = targetvertex;
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetvertex() {
		return targetvertex;
	}

	public void setTargetvertex(Vertex targetvertex) {
		this.targetvertex = targetvertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
