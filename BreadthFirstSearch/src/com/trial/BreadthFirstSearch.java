package com.trial;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public void bfs(Vertex rootVertex){
		
		Queue<Vertex> vertexQueue = new LinkedList<Vertex>();
		rootVertex.setVisited(true);
		vertexQueue.add(rootVertex);
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.poll();
			System.out.println(currentVertex);
			for(Vertex v: currentVertex.getAdjacentVertices()){
				if(!v.isVisited()){
				v.setVisited(true);
				vertexQueue.add(v);
				}
			}
		}
	}

}
