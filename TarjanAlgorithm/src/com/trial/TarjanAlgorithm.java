package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TarjanAlgorithm {
	
	private int time;
	private List<Vertex> vertexList;
	List<List<Vertex>> components;
	private Stack<Vertex> vertexStack;
	
	public TarjanAlgorithm(List<Vertex> vertexList) {
		super();
		this.vertexList = vertexList;
		components = new ArrayList<>();
		vertexStack = new Stack<>();
	}
	
	public void runAlgorithm(){
		for(Vertex vertex : vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		vertex.setLowlink(time++);
		boolean componentRoot =true;
		vertexStack.push(vertex);
		
		for(Vertex v:vertex.getAdjacentVertices()){
			if(!v.isVisited()){
				dfs(v);
			}
			
			if(vertex.getLowlink()>v.getLowlink()){
				vertex.setLowlink(v.getLowlink());
				componentRoot = false;
			}
		}
		
		if(componentRoot){
			List<Vertex> component = new ArrayList<>();
			while(true){
				Vertex currentVertex = vertexStack.pop();
				currentVertex.setLowlink(Integer.MAX_VALUE);
				component.add(currentVertex);
			
				if(currentVertex.getName().equals(vertex.getName())) break;
			}
			components.add(component);
		}
		
	}
	
	public void printComponents(){
		System.out.println(components);
	}
}
