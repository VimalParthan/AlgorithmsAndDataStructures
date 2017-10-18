package com.trial;

import java.util.List;

public class DepthFirstSearch {
	
	public void dfs(List<Vertex> vertexList){
		for(Vertex vertex : vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex){
		vertex.setVisited(true);
		System.out.println(vertex);	
		for(Vertex v:vertex.getAdjacentVertices()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
	}
}
