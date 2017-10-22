package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Vertex> adjacentVertices;
	private int lowLink;
	private boolean visited;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentVertices = new ArrayList<>();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}

	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}

	public int getLowLink() {
		return lowLink;
	}

	public void setLowLink(int lowLink) {
		this.lowLink = lowLink;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public void addNeighbour(Vertex vertex) {
		this.adjacentVertices.add(vertex);
	}

}
