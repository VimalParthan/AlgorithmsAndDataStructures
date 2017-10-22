package com.trial;

import java.util.List;
import java.util.Stack;

public class BellmanFordAlgorithm {
	
	
	public boolean bellmanFordAlgorithm(List<Vertex> vertexList,List<Edge> edgeList,Vertex rootVertex){
		
	
		rootVertex.setDistance(0);
		for(int i=0;i<vertexList.size()-1;i++){
			for(Edge edge:edgeList){
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertes();
				
				if(u.getDistance()==Double.MAX_VALUE)continue;
				
				double newDistance = u.getDistance()+edge.getWeight();
				if(v.getDistance()>newDistance){
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}
		
		
		for(Edge edge:edgeList){
			if(edge.getStartVertex().getDistance()!=Double.MAX_VALUE){
				if(detectCycle(edge)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean detectCycle(Edge edge){
		return edge.getStartVertex().getDistance()+edge.getWeight()<edge.getTargetVertes().getDistance();
	}
	
	public void shortestPathTo(Vertex vertex){
		System.out.println(vertex.getDistance());
		
		Stack<Vertex> shortestPath = new Stack<>();
		
		while(vertex!=null){
			shortestPath.push(vertex);
			vertex = vertex.getPreviousVertex();
		}
		while(!shortestPath.isEmpty()){
			System.out.println(shortestPath.pop());
		}
		
	}

}
