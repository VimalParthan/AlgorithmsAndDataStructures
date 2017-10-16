package com.trial;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Vertex vertex0 = new Vertex("A");
				Vertex vertex1 = new Vertex("B");
				Vertex vertex2 = new Vertex("C");
				Vertex vertex3 = new Vertex("D");
				
				vertex0.addNeighbour(new Edge(6,vertex0,vertex1));
				vertex0.addNeighbour(new Edge(3,vertex0,vertex2));
				vertex2.addNeighbour(new Edge(1,vertex2,vertex3));
		
				vertex1.addNeighbour(new Edge(1,vertex1,vertex2));
				vertex1.addNeighbour(new Edge(1,vertex1,vertex3));
				
				DjikstraAlgo dijsktraAlgorithm = new DjikstraAlgo();
				dijsktraAlgorithm.djikstrasAlgo(vertex0);
				dijsktraAlgorithm.shortestPathTo(vertex3);
				System.out.println(vertex3.getDistance());
				
	}
}
