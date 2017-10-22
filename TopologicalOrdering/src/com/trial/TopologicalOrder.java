package com.trial;

import java.util.List;
import java.util.Stack;

public class TopologicalOrder {
	
	private Stack<Vertex> vertexStack;
	
	public TopologicalOrder(){
		vertexStack = new Stack<>();
	}
	
	public void topologicalOrder(List<Vertex> vertexList){
			
		for(Vertex vertex : vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}
	
	private void dfs(Vertex vertex){
		vertex.setVisited(true);
		for(Vertex v:vertex.getAdjacentList()){
			if(!v.isVisited()){
			v.setVisited(true);	
			dfs(v);
			}
		}
		vertexStack.push(vertex);
		
	}
	
	public void showTopologicalOrder(){
		while(!vertexStack.isEmpty()){
			System.out.println(vertexStack.pop());
		}
	}
	
}
