package com.trial;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	
	public void bfs(Vertex root){
		
		Queue<Vertex> vertexQueue = new LinkedList<>();
		root.setVisited(true);
		vertexQueue.add(root);
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.remove();
			System.out.println(currentVertex.getData());
			
			for(Vertex v: currentVertex.getAdjacencyList()){
				if(!v.isVisited()){
					v.isVisited();
					vertexQueue.add(v);
				}
			}
		}
		
	}

}
