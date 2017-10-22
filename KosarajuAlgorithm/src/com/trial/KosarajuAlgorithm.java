package com.trial;

import java.util.List;

public class KosarajuAlgorithm {
	
	private boolean []marked;
	private int componentCount;
	
	public KosarajuAlgorithm(Graph graph){
		marked = new boolean [graph.getVertexList().size()];
		
		DepthFirstOrder depthFirstOrder = new DepthFirstOrder();
		depthFirstOrder.dfs(graph.transpose());
		List<Vertex> vertexList = depthFirstOrder.getVertexList();
		
		for(Vertex vertex :vertexList){
			if(!marked[vertex.getIndex()]){
				dfs(vertex);
				componentCount++;
			}
		}
	}
	
	private void dfs(Vertex vertex){
		marked[vertex.getIndex()]=true;
		vertex.setComponentId(componentCount);
		for(Vertex v:vertex.getAdjacentVertices()){
			if(!marked[v.getIndex()]){
				dfs(v);
			}
		}
	}

	public int getCount() {
		return componentCount;
	}
	

	

}
