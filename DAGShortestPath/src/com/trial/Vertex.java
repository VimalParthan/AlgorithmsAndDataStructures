package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private Vertex previousVertex;
	private List<Edge> adjacentEdge;
	private double distance = Double.MAX_VALUE;
	private boolean visited;

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex(String name) {
		this.name = name;
		this.adjacentEdge = new ArrayList<>();
	}

	public void addNeighbour(Edge edge) {
		this.adjacentEdge.add(edge);
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

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjacentEdge() {
		return adjacentEdge;
	}

	public void setAdjacentEdge(List<Edge> adjacentEdge) {
		this.adjacentEdge = adjacentEdge;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
