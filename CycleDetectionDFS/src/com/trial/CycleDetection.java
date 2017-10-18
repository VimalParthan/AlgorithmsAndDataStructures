package com.trial;

import java.util.List;

public class CycleDetection {
	
	public void detectCycle(List<Vertex> vertexList){
		for(Vertex vertex : vertexList){
			if(!vertex.isVisited())
				dfs(vertex);
		}
	}

	private void dfs(Vertex vertex){
		vertex.setBeingVisited(true);
		
		for(Vertex v:vertex.getAdjacentVertices()){
			
			if(v.isBeingVisited()){
				System.out.println("cycle detected at vertex: " +v);
				return;
			}
			if(!v.isVisited()){
				v.setVisited(true);
				dfs(v);
			}
			
		
		}
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}
}
