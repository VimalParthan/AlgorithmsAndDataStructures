package com.trial;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {
	
	private Stack<Vertex> vertexStack;
	
	public TopologicalOrdering (){
		vertexStack = new Stack<>();
	}
	
	public void dfs(List<Vertex> vertexList){
		for(Vertex vertex : vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}


	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		
		for(Vertex v:vertex.getVertexList()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		vertexStack.push(vertex);
		
	}
	
	public void showTopologicalOrdering(){
		Stack<Vertex> temp = new Stack<>();
		temp = (Stack<Vertex>) vertexStack.clone();
		while(!temp.isEmpty()){
			System.out.println(temp.pop());
		}
	}

}
