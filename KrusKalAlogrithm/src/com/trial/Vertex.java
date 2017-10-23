package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentEdges;
	private Node node;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}
	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	
	
	
	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	@Override
	public String toString() {
		return this.name;
	}

}
