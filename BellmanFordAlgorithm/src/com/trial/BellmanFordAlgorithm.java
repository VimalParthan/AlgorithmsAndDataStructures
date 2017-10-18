package com.trial;

import java.util.List;
import java.util.Stack;

public class BellmanFordAlgorithm {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	
	public BellmanFordAlgorithm(List<Vertex> vertexList,List<Edge> edgeList){
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}
	
	public boolean bellmanFordAlgoritm(Vertex vertex){
		
		vertex.setDistance(0);
		
		for(int i=0;i<vertexList.size()-1;i++){
			for(Edge edge : edgeList){
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetvertex();
				
				if(u.getDistance()==Double.MAX_VALUE)continue;
				
				double newDistance = u.getDistance()+edge.getWeight();
				
				if(newDistance<v.getDistance()){
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
				
			}
			
		}
		
		for(Edge edge:edgeList){
			if(edge.getStartVertex().getDistance()!=Double.MAX_VALUE){
				if(detectCycle(edge))return true;
			}
		}
		return false;
	} 
	
	private boolean detectCycle(Edge edge){
		return edge.getStartVertex().getDistance()+edge.getWeight()<edge.getTargetvertex().getDistance(); 
	}
	
	public void shortestPathTo(Vertex vertex){
		
		System.out.println(vertex.getDistance());
		Stack<Vertex> vertexStack = new Stack<Vertex>();
		
		while(vertex!=null){
			vertexStack.push(vertex);
			vertex = vertex.getPreviousVertex();
		}
		
		while(!vertexStack.isEmpty()){
			System.out.println(vertexStack.pop());
		}
		
	}
	
}
