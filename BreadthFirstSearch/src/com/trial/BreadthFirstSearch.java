package com.trial;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public void bfs(Vertex rootVertex){
		
		Queue<Vertex> vertexQueue= new LinkedList<>();
		rootVertex.setVisited(true);
		vertexQueue.add(rootVertex);
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.poll();
			System.out.println(currentVertex);
			for(Vertex vertex: currentVertex.getAdjacentVertices()){
				if(!vertex.isVisited()){
					vertex.setVisited(true);
					vertexQueue.add(vertex);
				}
			}
			
		}
		
	}

}
