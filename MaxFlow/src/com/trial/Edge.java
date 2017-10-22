package com.trial;

public class Edge {

	private Vertex startVertex;
	private Vertex targetVertex;
	private double availableFlow;
	private double flowUsed;

	public Vertex getStartVertex() {
		return startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public double getAvailableFlow() {
		return availableFlow;
	}

	public void setAvailableFlow(double availableFlow) {
		this.availableFlow = availableFlow;
	}

	public Edge(Vertex startVertex, Vertex targetVertex, double capacity) {
		super();
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.availableFlow = capacity;
	}

	public void decrementAvailableFlow(double valueToDecrement) {
		availableFlow -= valueToDecrement;
	}

	public void incrementFlowUsed(double valueToIncrement) {
		flowUsed += valueToIncrement;
	}

	@Override
	public String toString() {
		return startVertex + "--" + targetVertex + " : " + flowUsed + "/" + flowUsed + availableFlow;
	}
}
