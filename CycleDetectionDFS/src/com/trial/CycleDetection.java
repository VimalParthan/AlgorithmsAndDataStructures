package com.trial;

import java.util.List;

public class CycleDetection {
	
	public void detectCycle(List<Vertex> vertexList){
		for(Vertex vertex: vertexList){
			if(!vertex.isVisted()){
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setBeingVisted(true);
		for(Vertex v:vertex.getAdjacentVertices()){
			if(v.isBeingVisted()){
				System.out.println("Cycle detected at: "+v);
				return;
			}
			if(!v.isVisted()){
				dfs(v);
			}
		}
		
		vertex.setVisted(true);
		vertex.setBeingVisted(false);
		
	}

}
