package com.trial;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {
	
	private Stack<Vertex> vertexStack;
	
	public TopologicalOrdering(){
		this.vertexStack = new Stack<>();
	}
	
	public void topologicaloder(List<Vertex> vertexList){
		for(Vertex vertex:vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}
	
	public void dfs(Vertex vertex){
		vertex.setVisited(true);
		for(Edge edge:vertex.getAdjacentEdge()){
			if(!edge.getTargetVertex().isVisited()){
				edge.getTargetVertex().setVisited(true);
				dfs(vertex);
			}
		}
		vertexStack.push(vertex);
	}
	
	public Stack<Vertex> getVertexStack(){
		Collections.reverse(vertexStack);
		return vertexStack;
	}

}
