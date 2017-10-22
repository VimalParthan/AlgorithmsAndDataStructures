package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Vertex> adjacentVertex;
	private boolean visited;
	private boolean beingVisited;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacentVertex = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getAdjacentVertex() {
		return adjacentVertex;
	}

	public void setAdjacentVertex(List<Vertex> adjacentVertex) {
		this.adjacentVertex = adjacentVertex;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}
	
	public void addNeighbour(Vertex vertex){
		this.adjacentVertex.add(vertex);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
