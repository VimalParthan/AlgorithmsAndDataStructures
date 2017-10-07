package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String data;
	private boolean vistied;
	private List<Vertex> adjacencyList;
	
	public Vertex(String data) {
		this.data = data;
		this.adjacencyList = new ArrayList<>();
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean isVistied() {
		return vistied;
	}
	public void setVistied(boolean vistied) {
		this.vistied = vistied;
	}
	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void addVertex(Vertex vertex){
		this.adjacencyList.add(vertex);
	}
	
}
