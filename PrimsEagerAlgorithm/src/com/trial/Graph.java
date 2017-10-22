package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Vertex> vertexList;
	
	public Graph(){
		vertexList = new ArrayList<>();
	}
	
	public void addVertex(Vertex vertex){
		vertexList.add(vertex);
	}
	
	public void addEdge(Edge edge){
		Vertex startVertex =edge.getStartVertex();
		Vertex targetVertex = edge.getTargetVertex();
		
		vertexList.get(vertexList.indexOf(startVertex)).addEdge(new Edge(startVertex,targetVertex,edge.getWeight()));
		vertexList.get(vertexList.indexOf(targetVertex)).addEdge(new Edge(targetVertex,startVertex,edge.getWeight()));
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}
	
	
}
