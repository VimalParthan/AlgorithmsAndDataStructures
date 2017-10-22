package com.trial;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public void bfs(Vertex vertex){
		Queue<Vertex> vertexQueue = new LinkedList<>();
		vertex.setVisited(true);
		vertexQueue.add(vertex);
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.poll();
			System.out.println(currentVertex);
			for(Vertex v:currentVertex.getAdjacentVertex()){
				if(!v.isVisited()){
					v.setVisited(true);
					vertexQueue.add(v);
				}
			}
		}
	}

}
