package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	
	private List<Vertex> unvistiedVertices;
	private PriorityQueue<Edge> edgeQueue;
	private List<Edge> mst;
	private double totalSpan;
	
	public PrimsAlgorithm(List<Vertex> vertexList){
		this.unvistiedVertices=vertexList;
		edgeQueue = new PriorityQueue<>();
		mst = new ArrayList<>();
	}
	
	public void primsAlgorithm(Vertex vertex){
		unvistiedVertices.remove(vertex);
		while(!unvistiedVertices.isEmpty()){
			for(Edge edge: vertex.getAdjacentEdges()){
				Vertex u = edge.getTargetVertex();
				if(unvistiedVertices.contains(u)){
					edgeQueue.add(edge);
					
				}
			}
			
			Edge minEdge = edgeQueue.poll();
			mst.add(minEdge);
			totalSpan+=minEdge.getWeight();
			
			vertex = minEdge.getTargetVertex();
			unvistiedVertices.remove(vertex);
		}
	}
	
	public void showMST(){
		System.out.println(totalSpan);
		for(Edge edge:mst){
			System.out.println(edge.getStartVertex()+"--"+edge.getTargetVertex());
		}
	}

}
