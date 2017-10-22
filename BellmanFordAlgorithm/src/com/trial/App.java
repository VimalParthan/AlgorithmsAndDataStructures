package com.trial;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		vertexList.add(new Vertex("D"));
		vertexList.add(new Vertex("E"));
	
		List<Edge> edgeList = new ArrayList<>();
		
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(1),1));
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(4),1));
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(2),8));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(3),4));
		edgeList.add(new Edge(vertexList.get(3),vertexList.get(4),2));
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(4),3));
		edgeList.add(new Edge(vertexList.get(3),vertexList.get(0),3));
			
		BellmanFordAlgorithm bellmanFord = new BellmanFordAlgorithm();
	
		boolean hasNegativeCycle;
		
		hasNegativeCycle=bellmanFord.bellmanFordAlgorithm(vertexList, edgeList,vertexList.get(0));
		
		if(!hasNegativeCycle)
		bellmanFord.shortestPathTo(vertexList.get(4));
	}

}
