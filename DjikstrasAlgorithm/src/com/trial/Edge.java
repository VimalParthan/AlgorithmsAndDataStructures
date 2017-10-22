package com.trial;

public class Edge {
	
	private Vertex startVertex;
	private Vertex targetVertex;
	private int weight;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Edge(int weight,Vertex startVertex, Vertex targetVertex) {
		super();
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.weight = weight;
	}
	
	

}
