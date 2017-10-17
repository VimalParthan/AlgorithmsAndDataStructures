package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

	private String name;
	private boolean visited;
	private double distance = Double.POSITIVE_INFINITY;
	private List<Edge> adjacentEdges;
	private Edge minEdge;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}

	public void addEdge(Edge edge) {
		this.adjacentEdges.add(edge);
	}

	public String getName() {
		return name;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name;
}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}

	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}

	public Edge getMinEdge() {
		return minEdge;
	}

	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
	}

	@Override
	public int compareTo(Vertex o) {
		// TODO Auto-generated method stub
		return Double.compare(this.distance, o.getDistance());
	}

}
