package com.trial;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Vertex> adjacentVertices;
	private boolean visted;
	private boolean beingVisted;
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
	
	public void addNeighbour(Vertex vertex){
		this.adjacentVertices.add(vertex);
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
	public boolean isVisted() {
		return visted;
	}
	public void setVisted(boolean visted) {
		this.visted = visted;
	}
	public boolean isBeingVisted() {
		return beingVisted;
	}
	public void setBeingVisted(boolean beingVisted) {
		this.beingVisted = beingVisted;
	}
	
	

}
