package com.trial;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Vertex vertex0 = new Vertex("A");
				Vertex vertex1 = new Vertex("B");
				Vertex vertex2 = new Vertex("C");
	
				
				vertex0.addNeighbour(new Edge(1,vertex0,vertex1));
				vertex1.addNeighbour(new Edge(1,vertex1,vertex2));
				vertex0.addNeighbour(new Edge(1,vertex0,vertex2));
				
				
				DjikstrasAlgorithm dijsktraAlgorithm = new DjikstrasAlgorithm();
				dijsktraAlgorithm.djikstrasAlgorithm(vertex0);
				dijsktraAlgorithm.shortestPathTo(vertex2);
				System.out.println(vertex2.getDistance());
	}
}
