package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	private List<Vertex> unvisitedVertices;
	private List<Edge>spanningTree;
	private PriorityQueue<Edge> edgeHeap;
	
	private double fullCost;
	
	public PrimsAlgorithm(List<Vertex> unvisitedList){
		this.spanningTree = new ArrayList<>();
		this.unvisitedVertices = unvisitedList;
		this.edgeHeap = new PriorityQueue<>();
	}
	
	public void primsAlgorithm(Vertex vertex){
		this.unvisitedVertices.remove(vertex);
		while(!unvisitedVertices.isEmpty()){
			for(Edge edge:vertex.getAdjacentEdges()){
	
				if(this.unvisitedVertices.contains(edge.getTargetVertex())){
			
					this.edgeHeap.add(edge);
				}
			}
			
			Edge minEdge = this.edgeHeap.remove();
			this.spanningTree.add(minEdge);
			this.fullCost+=minEdge.getWeight();
			
			vertex = minEdge.getTargetVertex();
			this.unvisitedVertices.remove(vertex);
		
		}
	}
	
	public void showMST(){
		
		System.out.println("The minimum spanning tree cost:"+this.fullCost);
		for(Edge edge :spanningTree)
			System.out.println(edge.getStartVertex()+"-"+edge.getTargetVertex());
	}
}
