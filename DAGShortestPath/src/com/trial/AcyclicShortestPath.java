package com.trial;

import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {

	public void dagAlgorithm(List<Vertex> vertexList,Vertex startVertex){
		
		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
		topologicalOrdering.dfs(vertexList);
		startVertex.setDistance(0);
		
		List<Vertex> topologicalOrder = topologicalOrdering.getTopologicallyOrderedVertices();
		
		for(Vertex vertex:topologicalOrder){
			for(Edge edge:vertex.getAdjacentEdges()){
				Vertex v = edge.getStartVertex();
				Vertex u = edge.getTargetVertex();
				
				double newDistance = v.getDistance()+edge.getWeight();
				
				if(newDistance<u.getDistance()){
					u.setDistance(newDistance);
					u.setPreviousVertex(v);
				}
				
			}
		}
		
	}	
	
	public void shortestPathTo(Vertex vertex){
		Stack<Vertex> shortestPath = new Stack<>();
		while(vertex!=null){
			shortestPath.push(vertex);
			vertex = vertex.getPreviousVertex();
		}
		
		while(!shortestPath.isEmpty()){
			System.out.println(shortestPath.pop());
		}
	}
	
}
