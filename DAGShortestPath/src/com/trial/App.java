package com.trial;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		List<Vertex> vertexList = new ArrayList<>();

		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		
		vertex0.addNeighbour(new Edge(vertex0,vertex1,1));
		vertex0.addNeighbour(new Edge(vertex0,vertex2,10));
		vertex0.addNeighbour(new Edge(vertex1,vertex2,8));
	
		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.acyclicShortesPath(vertexList, vertex0);
		acyclicShortestPath.shortestPathTo(vertex2);
		System.out.println(vertex2.getDistance());
	
	}

}
