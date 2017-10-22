package com.trial;

import java.util.List;

public class FlowNetwork {
	
	private List<Vertex> vertexList;
	
	private int sourceIndex;
	
	private int sinkIndex;

	public FlowNetwork(List<Vertex> vertexList, int sourceIndex, int sinkIndex) {
		super();
		this.vertexList = vertexList;
		this.sourceIndex = sourceIndex;
		this.sinkIndex = sinkIndex;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public Vertex getSource() {
		return vertexList.get(sourceIndex);
	}

	public Vertex getSink() {
		return vertexList.get(sinkIndex);
	}

	public int getNumberOfVertices(){
		return vertexList.size();
	}	

}
