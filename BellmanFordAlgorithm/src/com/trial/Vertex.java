package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentEdge;
	private double distance = Double.MAX_VALUE;
	private Vertex previousVertex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public void addNeighbour(Edge edge){
		this.adjacentEdge.add(edge);
	}
	
	public Vertex getPreviousVertex() {
		return previousVertex;
	}
	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public Vertex(String name) {
	
		this.name = name;
		this.adjacentEdge =new ArrayList<>();
	}
	
	
}
