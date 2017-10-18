package com.trial;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {
	
	private Stack <Vertex> vertexStack;
	
	public TopologicalOrdering(){
		this.vertexStack = new Stack<>();
	}
	
	public void dfs(List<Vertex> vertexList){
	
		for(Vertex vertex : vertexList){
			if(!vertex.isVistied()){
				dfs(vertex);
			}
		}
	}
	
	private void dfs(Vertex vertex){
		vertex.setVistied(true);
		for(Vertex v:vertex.getAdjacencyList()){
			if(!v.isVistied()){
				dfs(v);
			}
		}
		vertexStack.push(vertex);
	} 
	
	public void showTopologicalOrdering(){
		Stack<Vertex> tempStack = vertexStack;
		while(!tempStack.isEmpty()){
			System.out.print(tempStack.pop()+"-->");
		}
	}
}
