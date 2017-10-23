package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	public List<Vertex> getVertexList() {
		return vertexList;
	}
	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}
	public List<Edge> getEdgeList() {
		return edgeList;
	}
	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}
	
	public void addVertex(Vertex vertex){
		this.vertexList.add(vertex);
	}
	
	public Graph() {
		this.vertexList = new ArrayList<>();
		this.edgeList = new ArrayList<>();
	}
	public void addEdge(Edge edge) {
		this.edgeList.add(edge);
	}
	public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
		super();
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}
	
	public Graph transpose(){
		
		Graph transposeGraph = new Graph();
		List<Vertex> transposedVertexList=this.vertexList;

		for(Edge edge: this.edgeList){
			transposedVertexList.get(transposedVertexList.indexOf(edge.getTargetVertex())).addVertex(edge.getStartVertex());
		}
		
		transposeGraph.setVertexList(transposedVertexList);
		
		return transposeGraph;
	}
	

}
