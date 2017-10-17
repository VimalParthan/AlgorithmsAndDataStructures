package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Edge> adjacentEdges;
	private boolean visited;

	public Vertex(String name) {
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}

	public void addEdge(Edge edge) {
		this.adjacentEdges.add(edge);
	}

	@Override
	public String toString() {

		return this.name;
	}

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

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
