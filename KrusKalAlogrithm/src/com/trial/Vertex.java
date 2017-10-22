package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private Node node;
	private List<Edge> adjacentEdges;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}
	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges =new ArrayList<>();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public void addNeighbour(Edge edge){
		this.adjacentEdges.add(edge);
	}
	
	
}
