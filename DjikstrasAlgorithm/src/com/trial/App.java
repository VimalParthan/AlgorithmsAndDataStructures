package com.trial;

public class App {

	public static void main(String[] args) {

				Vertex vertex0 = new Vertex("A");
				Vertex vertex1 = new Vertex("B");
				Vertex vertex2 = new Vertex("C");
	
				
				vertex0.addNeighbour(new Edge(vertex0,vertex1,1));
				vertex1.addNeighbour(new Edge(vertex1,vertex2,1));
				vertex2.addNeighbour(new Edge(vertex2,vertex0,3));
				
				
				Djikstra dijsktraAlgorithm = new Djikstra();
				dijsktraAlgorithm.djikstrasAlgo(vertex0);
				dijsktraAlgorithm.shortestPathTo(vertex2);
				System.out.println(vertex2.getDistance());
	}
}
