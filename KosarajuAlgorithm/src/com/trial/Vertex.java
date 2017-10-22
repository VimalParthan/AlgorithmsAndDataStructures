package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Vertex> adjacentVertices;
	private boolean visited;
	private int index;
	private int componentId;
	
	

	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
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

	public Vertex(int index,String name) {
		super();
		this.name = name;
		this.adjacentVertices = new ArrayList<>();
		this.index = index;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public void addVertex(Vertex vertex) {
		this.adjacentVertices.add(vertex);
	}

}
