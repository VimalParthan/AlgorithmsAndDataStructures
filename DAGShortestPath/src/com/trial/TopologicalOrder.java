package com.trial;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TopologicalOrder {
	
	private Stack<Vertex> vertexStack;
	
	public void topologicalOrder(List<Vertex> vertexList){
		vertexStack=new Stack<>();
		for(Vertex vertex:vertexList){
			if(!vertex.isVisited())
				dfs(vertex);
		}
	}
	
	private void dfs(Vertex vertex){
		vertex.setVisited(true);
		for(Edge edge:vertex.getAdjacentEdges()){
			if(!edge.getTargetVertex().isVisited()){
			
				dfs(edge.getTargetVertex());
			}
		}
		vertexStack.push(vertex);
	}
	
	public Stack<Vertex> getVertexStack(){
		Collections.reverse(vertexStack);
		return vertexStack;
	}

}
