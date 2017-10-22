package com.trial;

import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {
	
	public void dagShortestPath(List<Vertex> vertexList,Vertex startVertex){
		startVertex.setDistance(0);
		TopologicalOrder topologicalOrder = new TopologicalOrder();
		topologicalOrder.topologicalOrder(vertexList);
		Stack<Vertex> vertexStack= topologicalOrder.getVertexStack();
		
		for(Vertex vertex : vertexStack){
			for(Edge edge:vertex.getAdjacentEdges()){
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double newDistance = u.getDistance()+edge.getWeight();
				
				if(v.getDistance()>newDistance){
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
			vertex= vertex.getPreviousVertex();
		}
		
		while(!shortestPath.isEmpty()){
			System.out.println(shortestPath.pop());
		}
	}

}
