package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Vertex> vertex;
	private boolean visited;
	private int index;
	private int componentId;
	
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
	public List<Vertex> getVertex() {
		return vertex;
	}
	public void setVertex(List<Vertex> vertex) {
		this.vertex = vertex;
	}
	public boolean isVisited() {
		return visited;
	}
	public Vertex(int index,String name) {
		
		this.name = name;
		this.vertex = new ArrayList<>();
		this.index = index;
	}
	public void setVisited(int index,boolean visited) {
		this.visited = visited;
		this.index = index;
	}
	
	public void addVertex(Vertex vertex){
		this.vertex.add(vertex);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}



	public int getComponentId() {
		return componentId;
	}



	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

}
