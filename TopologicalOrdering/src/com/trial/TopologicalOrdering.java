package com.trial;

import java.util.Stack;

public class TopologicalOrdering {
	
	private Stack<Vertex> vertexStack;
	
	public TopologicalOrdering(){
		this.vertexStack = new Stack<>();
	}
	
	public void dfs(Vertex currentVertex){
		currentVertex.setVistied(true);
		for(Vertex v:currentVertex.getAdjacencyList()){
			if(!v.isVistied()){
				v.setVistied(true);
				dfs(v);
			}
		}
		
		vertexStack.add(currentVertex);
	}
	
	public Stack<Vertex> getVertexStack(){
		return this.vertexStack;
	}

}
