package com.trial;

import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	
	private List<Vertex> vertexList;
	private PriorityQueue<Vertex> minHeap;

	public PrimsAlgorithm(Graph graph){
		this.vertexList = graph.getVertexList();
		this.minHeap = new PriorityQueue<>();
	}
	
	public void spanningTree(){
		for(Vertex vertex:vertexList){
			if(!vertex.isVisited())
			makePrim(vertex);
		}
	}

	private void makePrim(Vertex vertex) {
//		vertex.setDistance(0);
		minHeap.add(vertex);
		
		while(!minHeap.isEmpty()){
			Vertex currentVertex = minHeap.poll();
			scanVertex(currentVertex);
		}
		
	}

	private void scanVertex(Vertex vertex) {
		
		vertex.setVisited(true);
		
		for(Edge edge: vertex.getAdjacentEdges()){
			Vertex w = edge.getTargetVertex();
			
			if(w.isVisited()) continue;
			
			if(edge.getWeight()<w.getDistance()){
				w.setDistance(edge.getWeight());
				w.setMinEdge(edge);
			}
			if(minHeap.contains(w)){
				minHeap.remove(w);
			}
			
			minHeap.add(w);
		}

	}
	
	public void showMST(){
		double totalSpan=0;
		for(Vertex vertex:vertexList){
			if(vertex.getMinEdge()!=null){
			System.out.println(vertex.getMinEdge().getStartVertex()+"--"+vertex.getMinEdge().getTargetVertex());
			totalSpan+=vertex.getMinEdge().getWeight();}
		}
		System.out.println(totalSpan);
	}

}
