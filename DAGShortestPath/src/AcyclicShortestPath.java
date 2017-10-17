import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {

	public void shortestPath(List<Vertex> vertexList, Vertex sourcevertex, Vertex targetVertex) {

		sourcevertex.setDistance(0);
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.makeTopologicalOrder(vertexList);

		Stack<Vertex> stack = topologicalSort.getTopologicalOrder();

		for (Vertex actualVertex : stack) {
			for (Edge edge : actualVertex.getAdjacentEdges()) {
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getEndVertex();

				double newDistance = u.getDistance() + edge.getWeight();

				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}

		if (targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("No shortest path there ....");
		} else {
			System.out.println("Target vertex shortest path: " + targetVertex.getDistance());
		}

	}

	public void shortestPathTo(Vertex targetVertex) {

		Stack<Vertex> shortestPathStack = new Stack<>();

		for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
			shortestPathStack.push(vertex);
		}

		while (!shortestPathStack.isEmpty()) {
			System.out.print(shortestPathStack.pop() + "->");
		}

		System.out.println();
	}

}
