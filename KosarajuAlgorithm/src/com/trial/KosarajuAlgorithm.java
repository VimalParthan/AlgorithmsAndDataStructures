package com.trial;

import java.util.List;

public class KosarajuAlgorithm {
	
	private boolean [] visited;
	private int count;
	

	
	public  KosarajuAlgorithm(Graph graph){
		
		
		visited = new boolean[graph.getVertexList().size()];
		
		DepthFirstOrder dfs = new DepthFirstOrder();
		
		dfs.dfs(graph.transpose().getVertexList());
		
		List<Vertex> dfsVertexes = dfs.getVertexList();
		
		for(Vertex vertex:dfsVertexes){
			if(!visited[vertex.getIndex()]){
				dfs(vertex);
				count++;
			}
			
		}

	}

	private void dfs(Vertex vertex) {
		visited[vertex.getIndex()]=true;
		vertex.setComponentId(count);
		
		for(Vertex v: vertex.getVertex()){
			if(!visited[v.getIndex()])
				dfs(v);
		}
			
	}

	public int getCount() {
		return count;
	}
	

}
