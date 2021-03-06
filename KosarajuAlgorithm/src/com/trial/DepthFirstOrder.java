package com.trial;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstOrder {
	
	private List<Vertex> vertexList;
	
	public DepthFirstOrder() {
		vertexList = new ArrayList<>();
	}
	
	
	public void dfs(List<Vertex> vertexList){
		for(Vertex vertex:vertexList){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}


	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		for(Vertex v:vertex.getVertex()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		vertexList.add(vertex);
	}
	
	public List<Vertex> getVertexList(){
		return this.vertexList;
	}
	
}
