package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	
	private List<Vertex> unvisitedVertices;
	private List<Edge> mst;
	private PriorityQueue<Edge> minHeap;
	private double totalSpan;
	
	public PrimsAlgorithm(List<Vertex> vertexList) {
		
		unvisitedVertices = vertexList;
		mst = new ArrayList<>();
		minHeap = new PriorityQueue<>();
	}
	
	
	public void primsAlgorithm(Vertex vertex){
		
		unvisitedVertices.remove(vertex);
		
		while(!unvisitedVertices.isEmpty()){
			for(Edge edge:vertex.getAdjacentEdges()){	
				
				if(unvisitedVertices.contains(edge.getTargetVertex())){
	
					minHeap.add(edge);
				}
				
			}
			
			Edge minEdge = minHeap.remove();
			mst.add(minEdge);
			totalSpan+=minEdge.getWeight();	
			vertex = minEdge.getTargetVertex();
			unvisitedVertices.remove(vertex);
		}
		
	}
	
	public void showMST(){
		System.out.println(totalSpan);
		for(Edge edge:mst){
			System.out.println(edge.getStartVertex()+"-"+edge.getTargetVertex());
		}
	}

}
