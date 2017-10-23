package com.trial;

import java.util.PriorityQueue;
import java.util.Stack;

public class DjikstrasAlgorithm {

	public void djikstrasAlgorithm(Vertex sourceVertex) {
		sourceVertex.setDistance(0);
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);

		while (!priorityQueue.isEmpty()) {
			
			Vertex currentVertex = priorityQueue.poll();
			
			for (Edge edge : currentVertex.getAdjacentEdges()) {
				Vertex v = edge.getTargetVertex();
				double tempDistance = v.getDistance();
				double newDistance = currentVertex.getDistance() + edge.getWeight();

				if (newDistance < tempDistance) {
					priorityQueue.remove(v);
					v.setDistance(newDistance);
					v.setPreviousVertex(currentVertex);
					priorityQueue.add(v);
				}

			}
		}
	}
	
	public void shortestPathTo(Vertex vertex){
		Stack<Vertex> shortesPath = new Stack<>();
		
		while(vertex!=null){
			shortesPath.push(vertex);
			vertex=vertex.getPreviousVertex();
		}
		
		while(!shortesPath.isEmpty()){
			System.out.println(shortesPath.pop());
		}
	}

}
