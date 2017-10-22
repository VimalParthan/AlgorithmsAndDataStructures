package com.trial;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstOrder {
	
	private List<Vertex> vertexList;
	
	public DepthFirstOrder(){
		vertexList = new ArrayList<>();
	} 
	
	public void dfs(Graph graph){
		
		for(Vertex vertex:graph.getVertexList()){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
		
	}
	
	private void dfs(Vertex vertex){
		vertex.setVisited(true);
		vertexList.add(vertex);
		for(Vertex v:vertex.getAdjacentVertices()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		vertexList.add(vertex);
	}
	
	
	public List<Vertex> getVertexList(){
		return vertexList;
	}

}
