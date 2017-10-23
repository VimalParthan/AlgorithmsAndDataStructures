package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private int lowlink;
	private List<Vertex> adjacentVertices;
	private boolean visited;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLowlink() {
		return lowlink;
	}

	public void setLowlink(int lowlink) {
		this.lowlink = lowlink;
	}

	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}

	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentVertices = new ArrayList<>();

	}

	public void addNeighbour(Vertex vertex) {
		this.adjacentVertices.add(vertex);
	}

	@Override
	public String toString() {
		return this.name;
	}
}
