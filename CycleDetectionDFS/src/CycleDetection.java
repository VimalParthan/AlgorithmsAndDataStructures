import java.util.List;

public class CycleDetection {

	public void detedCycle(List<Vertex> vertexList) {

		for (Vertex v : vertexList)
			if (!v.isVisited())
				dfs(v);
	}

	private void dfs(Vertex vertex) {
		System.out.println("DFS on vertex"+ vertex);
		vertex.setBeingVisited(true);

		for (Vertex v : vertex.getAdjacenciesList()) {
			
			System.out.println("visiting neighbours of vertex "+ vertex);
			
			if (v.isBeingVisited()) {
				System.out.println("There is a backward edge: so there is a cycle");
				return;
			}

			if (!v.isVisited()) {
				System.out.println("Visiting vertex "+ v+" recursively ..");
				v.setVisited(true);
				dfs(v);
			}
		}	
			System.out.println("set vertex "+vertex+" set beingVisited(false) and set visited(true)");
			vertex.setBeingVisited(false);
			vertex.setVisited(true);
		
	}
}
