package com.trial;

import java.util.List;

public class DepthFirstSearch {
	

	public void dfs(List<Vertex> graph){
		
		for(Vertex v : graph){
			if(!v.isVisited()){
				v.setVisited(true);
				dfs(v);
			}
		}
	}
	
	private void dfs(Vertex currentVertex){
		System.out.println(currentVertex.getData());

		for(Vertex v: currentVertex.getAdjacencyList()){
			if(!v.isVisited()){
				v.setVisited(true);
				dfs(v);
				
			}
		}
			
	}

}
