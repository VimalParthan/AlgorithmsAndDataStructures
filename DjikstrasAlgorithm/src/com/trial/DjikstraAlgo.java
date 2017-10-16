package com.trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DjikstraAlgo {
	
	public void djikstrasAlgo(Vertex rootVertex){
		
		rootVertex.setDistance(0);
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
		vertexQueue.add(rootVertex);
		
		while(!vertexQueue.isEmpty()){
			
			Vertex currentVertex = vertexQueue.poll();
			
			for(Edge e : currentVertex.getAdjacentEdges()){
				
				Vertex targetVertex = e.getEndingVertex();
				int tempDistance = targetVertex.getDistance();
				int newDistance = currentVertex.getDistance()+e.getWeight();
				if(newDistance<tempDistance){
					vertexQueue.remove(targetVertex);
					targetVertex.setDistance(newDistance);
					targetVertex.setPredecessor(currentVertex);
					vertexQueue.add(targetVertex);
				}
				
				
			}
			
		}
		
	}
	
	
	public void shortestPathTo(Vertex destinatinationVertex){
		
		List<Vertex> shortestPath = new ArrayList<>();
		
		for(Vertex vertex =destinatinationVertex;vertex!=null;vertex=vertex.getPredecessor()){
			shortestPath.add(vertex);
		}
		
		Collections.reverse(shortestPath);
		
		for(Vertex vertex: shortestPath){
			System.out.println(vertex);
		}
		
	}

}
