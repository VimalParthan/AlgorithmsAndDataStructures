package com.trial;

import java.util.List;

public class FlowNetwork {
	
	private List<Vertex> vertexList;
	
	private int sourceIndex;
	private int sinkIndex;

	public FlowNetwork(List<Vertex> vertexList,int sourceIndex,int sinkIndex) {
		super();
		this.vertexList = vertexList;
		this.sourceIndex = sourceIndex;
		this.sinkIndex = sinkIndex;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}
	
	public void addEdge(Edge edge){
		this.vertexList.get(vertexList.indexOf(edge.getStartVertex())).addEdge(edge);
	}
	
	public Vertex getSource(){
		return this.vertexList.get(sourceIndex);
	}
	
	public Vertex getSink(){
		return this.vertexList.get(sinkIndex);
	}

}
