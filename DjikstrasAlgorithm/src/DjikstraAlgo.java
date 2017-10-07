import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DjikstraAlgo {

	public void disjikstrasAlgo(Vertex root) {

		root.setDistance(0);
		PriorityQueue<Vertex> queue = new PriorityQueue<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			Vertex actualVertex = queue.poll();

			for (Edge e : actualVertex.getNeighbouringEdges()) {

				Vertex targetVertex = e.getEndVertex();
				int previousDistance = targetVertex.getDistance();
				int newDistance = actualVertex.getDistance() + e.getWeight();

				if (previousDistance > newDistance) {
					queue.remove(targetVertex);
					targetVertex.setDistance(newDistance);
					targetVertex.setPredecessar(actualVertex);
					queue.add(targetVertex);

				}

			}

		}

	}
	
	public List<Vertex> shortestPathTo(Vertex vertex){
		
		List<Vertex> shortestPath = new ArrayList<>();
		
		for(Vertex v = vertex;v!=null;v=v.getPredecessar()){
			shortestPath.add(v);
		}		
		
		Collections.reverse(shortestPath);
		
		return shortestPath;
	}

}
