package com.trial;

import java.util.PriorityQueue;
import java.util.Stack;

public class Djikstra {
	
	public void djikstrasAlgo(Vertex sourceVertex){
		
		sourceVertex.setDistance(0);
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
		vertexQueue.add(sourceVertex);
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.remove();
			
			for(Edge edge: currentVertex.getAdjacentEdges()){
				
				Vertex v= edge.getEndVertex();
				
				int prevDistance = v.getDistance();
				
				int newDistance = currentVertex.getDistance()+edge.getWeight();
				
				if(prevDistance>newDistance){
		
					vertexQueue.remove(v);
					v.setDistance(newDistance);
					v.setPrevious(currentVertex);
					vertexQueue.add(v);
				}
				
			}
			
		}
		
	}
	
	public void shortestPathTo(Vertex targetVertex){
		
		Stack<Vertex> shortestPathStack = new Stack<>();
		
		for(Vertex vertex = targetVertex;vertex!=null;vertex= vertex.getPrevious()){
			shortestPathStack.push(vertex);
		}
		
		while(!shortestPathStack.isEmpty()){
			System.out.print(shortestPathStack.pop()+"->");
		}
			
		System.out.println();		
	}

}
