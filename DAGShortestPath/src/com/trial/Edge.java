package com.trial;

public class Edge {
	
	private Vertex startvertex;
	private Vertex endVertex;
	private double weight;
	
	public Edge(Vertex startvertex, Vertex endVertex, double weight) {
		super();
		this.startvertex = startvertex;
		this.endVertex = endVertex;
		this.weight = weight;
	}

	public Vertex getStartvertex() {
		return startvertex;
	}

	public void setStartvertex(Vertex startvertex) {
		this.startvertex = startvertex;
	}

	public Vertex getEndVertex() {
		return endVertex;
	}

	public void setEndVertex(Vertex endVertex) {
		this.endVertex = endVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
