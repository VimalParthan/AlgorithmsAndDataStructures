package com.trial;

import java.util.List;

public class DepthFirstSearch {

	public void dfs(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}
		}

	}

	private void dfs(Vertex vertex) {

		System.out.println(vertex);

		for (Vertex v : vertex.getAdjacencyList()) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfs(v);

			}
		}

	}

}
