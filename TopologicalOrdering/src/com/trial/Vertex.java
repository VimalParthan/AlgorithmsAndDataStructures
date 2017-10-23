package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Cloneable{
	
	private String name;
	private List<Vertex> vertexList;
	private boolean visited;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vertex> getVertexList() {
		return vertexList;
	}
	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
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
		this.vertexList = new ArrayList<>();

	}
	
	public void addNeighbour(Vertex vertex){
		this.vertexList.add(vertex);
	}
	@Override
	public String toString() {
		return this.name;
	}
	

}
