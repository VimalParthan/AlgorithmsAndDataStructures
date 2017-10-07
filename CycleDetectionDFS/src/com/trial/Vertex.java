package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String data;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjacenciesList;
	
	public Vertex(String data){
		this.data = data;
		this.adjacenciesList = new ArrayList<>();
	}
	
	public void addNeighbour(Vertex vertex){
		this.adjacenciesList.add(vertex);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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

	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Vertex> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}
	
	

}
