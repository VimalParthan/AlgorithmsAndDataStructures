package com.trial;

import java.util.ArrayList;
import java.util.List;

public class TopologicalOrdering {
	
	private List<Vertex> vertexList;
	
	public TopologicalOrdering(){
		vertexList = new ArrayList<>();
	}
	
	public void dfs(List<Vertex> vertexList){
		for(Vertex vertex:vertexList){
			if(!vertex.isVisited())
				dfs(vertex);
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		for(Edge edge: vertex.getAdjacentEdges()){
			if(!edge.getTargetVertex().isVisited()){
				dfs(edge.getTargetVertex());
			}
		}
		
		vertexList.add(vertex);
	}
	
	public List<Vertex> getTopologicallyOrderedVertices(){
		return this.vertexList;
	}
	

}
