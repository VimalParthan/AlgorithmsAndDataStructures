package com.trial;

import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	
	private List<Vertex> vertices;
	private PriorityQueue<Vertex> minHeap;
	
	public PrimsAlgorithm(Graph graph) {
		super();
		this.vertices = graph.getVertexList();
		this.minHeap = new PriorityQueue<>();
	}
	
	public void spanningTree(){
		
		for(Vertex vertex: vertices){
			if(!vertex.isVisited()){
				makePrim(vertex);
			}
		}
	}
	
	private void makePrim(Vertex vertex){
		
		vertex.setDistance(0);
		minHeap.add(vertex);
		while(!minHeap.isEmpty()){
			scanVertices(minHeap.remove());
		}
		
	}
	
	private void scanVertices(Vertex vertex){
		vertex.setVisited(true);
		
		for(Edge edge :vertex.getAdjacentEdges()){
			Vertex w = edge.getTargetVertex();
			
			if(w.isVisited())continue;
			
			if(edge.getWeight()<w.getDistance()){
				w.setMinEdge(edge);
				w.setDistance(edge.getWeight());
			}
			
			if(minHeap.contains(w)){
				minHeap.remove(w);
			}
			
			minHeap.add(w);
		}
	}
	
	public void showMST(){
		for(Vertex vertex:vertices){
			if(vertex.getMinEdge()!=null){
				System.out.println(vertex.getMinEdge().getStartVertex()+"-"+vertex.getMinEdge().getTargetVertex());
			}
		}
	}

}
