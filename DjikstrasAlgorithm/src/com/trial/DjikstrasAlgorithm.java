package com.trial;

import java.util.PriorityQueue;
import java.util.Stack;

public class DjikstrasAlgorithm {
	
	public void djikstrasAlgorithm(Vertex vertex){
		
		vertex.setDistance(0);
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
		vertexQueue.add(vertex);
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.poll();
			for(Edge edge:currentVertex.getAdjacentEdges()){
				
				Vertex v = edge.getTargetVertex();
				
				int tempDistance = v.getDistance();
				
				int newDistance = currentVertex.getDistance()+edge.getWeight();
				
				if(tempDistance>newDistance){
					vertexQueue.remove(v);
					v.setDistance(newDistance);
					v.setPreviosVertex(currentVertex);
					vertexQueue.add(v);
				}
			}
		}
	}
	
	
	public void shortestPathTo(Vertex vertex){
		Stack<Vertex> shortestPath = new Stack<>();
		
		while(vertex!=null){
			shortestPath.push(vertex);
			vertex = vertex.getPreviosVertex();
		}
		
		while(!shortestPath.isEmpty()){
			System.out.println(shortestPath.pop());
		}
	}
}
