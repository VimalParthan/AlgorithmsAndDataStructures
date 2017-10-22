package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

	
	private List<Vertex> vertexList;
	private PriorityQueue<Vertex> minHeap;
	private double totalSpan;
	

	public PrimsAlgorithm(Graph graph) {
		vertexList = graph.getVertexList();
		minHeap = new PriorityQueue<>();
	}
	
	public void primsAlgorithm(){
	
		for(Vertex vertex :vertexList){
			if(!vertex.isVisited()){
				makePrims(vertex);
			}
		}
		
	}  
	
	private void makePrims(Vertex vertex){
		vertex.setDistance(0);
		minHeap.add(vertex);
		while(!minHeap.isEmpty()){
			Vertex v=minHeap.remove();
			scanVertex(v);
		}
	}
	
	private void scanVertex(Vertex vertex){
		vertex.setVisited(true);
		
		for(Edge edge:vertex.getAdjacentEdges()){
			Vertex w = edge.getTargetVertex();
			
			if(w.isVisited()) continue;
			
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
		
		for(Vertex vertex: vertexList){
			if(vertex.getMinEdge()!=null){
				System.out.println(vertex.getMinEdge().getStartVertex()+"-"+vertex.getMinEdge().getTargetVertex());
			}
		}
	}

}
