package com.trial;

import java.util.List;
import java.util.Stack;

public class BellmanFord {

	private List<Edge> edges;
	private int numberOfVertices;

	public BellmanFord(List<Edge> edges, int numberOfVertices) {
		super();
		this.edges = edges;
		this.numberOfVertices = numberOfVertices;
	}

	public boolean bellmanFordAlgo(Vertex sourceVertex) {

		sourceVertex.setDistance(0);

		for (int i = 0; i < numberOfVertices - 1; i++) {
			for (Edge currentEdge : edges) {

				Vertex u = currentEdge.getStartVertex();
				Vertex v = currentEdge.getEndVertex();

				if (u.getDistance() == Integer.MAX_VALUE)
					continue;

				int newDistance = u.getDistance() + currentEdge.getWeight();

				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}

		for (Edge edge : edges) {
			if (edge.getStartVertex().getDistance() != Integer.MAX_VALUE) {
				if (hasNegativeCycle(edge)) {
					System.out.println("negative cycle detected");
					return true;
				}
			}
		}

		return false;

	}

	private boolean hasNegativeCycle(Edge edge) {

		return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getEndVertex().getDistance();

	}

	public void shortestPathTo(Vertex targetVertex) {

		Stack<Vertex> shortestPath = new Stack<>();

		for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
			shortestPath.push(vertex);
		}

		while (!shortestPath.isEmpty()) {
			System.out.print(shortestPath.pop().toString() + "->");
		}

	}

}
