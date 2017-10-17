package com.trial;

import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {
	
	public boolean acyclicAlgo(List<Vertex> vertexList,Vertex startVertex,Vertex targetVertex){
		
		startVertex.setDistance(0);
		TopologicalOrder topologicalOrder = new TopologicalOrder();
		topologicalOrder.topologicalOrder(vertexList);
		
		Stack<Vertex> vertexStack = topologicalOrder.getTopologicalOrder();
		
		for(Vertex vertex : vertexStack){
			for(Edge edge: vertex.getAdjacentEdges()){
				
				Vertex u = edge.getStartvertex();
				Vertex v = edge.getEndVertex();
				
				if(u.getDistance()==Double.MAX_VALUE)continue;
					
				double newDistance = u.getDistance()+edge.getWeight();
				
				if(newDistance<v.getDistance()){
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
				
			}
		}
		
		if(targetVertex.getDistance()!=Double.MAX_VALUE){
			System.out.println("Shortest path is : "+targetVertex.getDistance());
			return true;
		}else{
			System.out.println("No Path found");
			return false;
		}
		
	}
	
	public void showShortestPath(Vertex targetVertex){
		
		Stack<Vertex> vertexStack = new Stack<>();
		
		for(Vertex vertex = targetVertex;vertex!=null;vertex = vertex.getPreviousVertex()){
			vertexStack.push(vertex);
		}
		
		while(!vertexStack.isEmpty()){
			System.out.print(vertexStack.pop()+"->");
		}
		
	}

}
