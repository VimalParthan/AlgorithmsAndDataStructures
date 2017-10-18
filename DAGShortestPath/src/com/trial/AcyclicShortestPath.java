package com.trial;

import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {
	
	public void acyclicShortesPath(List<Vertex> vertexList,Vertex startVertex){
		startVertex.setDistance(0);
		
		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
		
		topologicalOrdering.topologicaloder(vertexList);
		
		Stack<Vertex> vertexStack = topologicalOrdering.getVertexStack();
		
		for(Vertex vertex : vertexStack){
			for(Edge edge: vertex.getAdjacentEdge()){
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double newDistance = u.getDistance()+edge.getWeight();
				
				if(newDistance<v.getDistance()){
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
				
			}
		}
	}
	
	public void shortestPathTo(Vertex vertex){
		Stack<Vertex> shortestPath = new Stack<>();
		
		while(vertex!=null){
			shortestPath.push(vertex);
			vertex=vertex.getPreviousVertex();
		}
		
		while(!shortestPath.isEmpty()){
			System.out.println(shortestPath.pop());
		}
		
	}

}
