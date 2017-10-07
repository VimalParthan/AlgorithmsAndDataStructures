package com.trial;

import java.util.List;

public class CycleDetection {
	
	public void detectCycle(List<Vertex> vertexList){
		
		for(Vertex v: vertexList){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		
	}
	
	private void dfs(Vertex vertex){
		
		vertex.setBeingVisited(true);
		System.out.println("vertex " +vertex + " is being visited");
		
		System.out.println("visiting neighbours of vertex "+ vertex);
		for(Vertex v : vertex.getAdjacenciesList()){
			
			if(v.isBeingVisited()){
				System.out.println("there is backward edge so there is a cycle");
				return;
			}
			if(!v.isVisited()){
				System.out.println("visiting vertex "+ v +" recursively");
				v.setVisited(true);
				dfs(v);
			}
		}
		
		System.out.println("setting vertex "+vertex +" beingVisited(false) and isVisited(true)" );
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
		
	}

}
