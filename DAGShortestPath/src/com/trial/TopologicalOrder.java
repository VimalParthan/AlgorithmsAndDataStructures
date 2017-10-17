package com.trial;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TopologicalOrder {
	
	private Stack<Vertex> vertexStack;
	
	public TopologicalOrder() {
		vertexStack = new Stack<>();
	}
	
	public void topologicalOrder(List<Vertex> vertexList){
		
		for(Vertex vertex: vertexList){
			if(!vertex.isVisited()){
				vertex.setVisited(true);
				dfs(vertex);
			}
		}
		
	}
	
	private void dfs(Vertex vertex){
		
		for(Edge edge : vertex.getAdjacentEdges()){
			if(!edge.getEndVertex().isVisited()){
				edge.getEndVertex().setVisited(true);
				dfs(edge.getEndVertex());
			}
		}
		vertexStack.push(vertex);
	}

	public Stack<Vertex> getTopologicalOrder(){
		Collections.reverse(vertexStack);
		return vertexStack;
	}
	
}
