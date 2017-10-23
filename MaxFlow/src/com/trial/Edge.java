package com.trial;

public class Edge {
	
	private Vertex startVertex;
	private Vertex targetVertex;
	private double flowRemaining;
	private double flowUsed;
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
	public double getFlowRemaining() {
		return flowRemaining;
	}
	public void setFlowRemaining(int flowRemaining) {
		this.flowRemaining = flowRemaining;
	}
	public double getFlowUsed() {
		return flowUsed;
	}
	public void setFlowUsed(int flowUsed) {
		this.flowUsed = flowUsed;
	}
	
	public void incrementFlowUsed(double incrementValue){
		this.flowUsed+=incrementValue;
	}
	
	public void decrementFlowUsed(double decrementValue){
		this.flowRemaining-=decrementValue;
	}
	public Edge(Vertex startVertex, Vertex targetVertex,double capacity) {

		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.flowRemaining = capacity;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return startVertex+"-"+targetVertex;
}
}
