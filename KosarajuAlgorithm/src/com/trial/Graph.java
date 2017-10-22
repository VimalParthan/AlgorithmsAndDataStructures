package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;

	public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
		super();
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	private Graph() {
		this.vertexList = new ArrayList<>();
		this.edgeList = new ArrayList<>();
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public Graph(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public void addVertex(Vertex vertex) {
		vertexList.add(vertex);
	}

	public void addEdge(Edge edge) {
		vertexList.get(vertexList.indexOf(edge.getStartVertex())).addVertex(edge.getTargetVertex());
	}

	public Graph transpose(){
		Graph transpose = new Graph();
		
		List<Vertex> transposedVertex =vertexList;
		
		for(Edge edge: edgeList){
			transposedVertex.get(transposedVertex.indexOf(edge.getTargetVertex())).addVertex(edge.getStartVertex());
		}
		transpose.setVertexList(transposedVertex);
		
		return transpose;
		
	}

}
