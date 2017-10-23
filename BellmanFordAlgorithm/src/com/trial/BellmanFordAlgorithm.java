package com.trial;

import java.util.List;
import java.util.Stack;

public class BellmanFordAlgorithm {
	
	public boolean bellmanfordAlgorithm(List<Vertex> vertexList,List<Edge> edgeList,Vertex startVertex){
		
		startVertex.setDistance(0);
		
		for(int i=0;i<vertexList.size()-1;i++){
			for(Edge edge:edgeList){
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				if(u.getDistance()==Double.MAX_VALUE)continue;
				
				double newDistance = u.getDistance()+edge.getWeight();
				
				if(newDistance<v.getDistance()){
					v.setDistance(newDistance);
					v.setParentVertex(u);
				}
				
				
			}
		}
		
		for(Edge edge:edgeList){
			if(edge.getStartVertex().getDistance()!=Double.MAX_VALUE){
				if(detectCycle(edge)){
					System.out.println("Cycle detected at: "+edge.getStartVertex());
					return true;
				}
			}
		}
		
		return false;
		
	}

	private boolean detectCycle(Edge edge) {
		
		return edge.getStartVertex().getDistance()+edge.getWeight()<edge.getTargetVertex().getDistance();
	}
	
	public void shortestPathTo(Vertex vertex){
		Stack<Vertex> shortestPath = new Stack<>();
		while(vertex!=null){
			shortestPath.push(vertex);
			vertex = vertex.getParentVertex();
		}
		
		while(!shortestPath.isEmpty()){
			System.out.println(shortestPath.pop());
		}
	}

	
}
