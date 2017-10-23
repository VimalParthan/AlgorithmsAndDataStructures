package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertexList;

	public Graph() {
		vertexList = new ArrayList<>();
	}

	public void addVertex(Vertex vertex) {
		this.vertexList.add(vertex);
	}

	public void addEdge(Edge edge) {
		this.vertexList.get(vertexList.indexOf(edge.getStartVertex()))
				.addEdge(new Edge(edge.getStartVertex(), edge.getTargetVertex(), edge.getWeight()));
		this.vertexList.get(vertexList.indexOf(edge.getTargetVertex()))
				.addEdge(new Edge(edge.getTargetVertex(), edge.getStartVertex(), edge.getWeight()));
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

}
