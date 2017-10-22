
public class KosarajuAlgorithm {

	private int count;
	private boolean[] marked;
	
	public int getCount() {
		return count;
	}


	public KosarajuAlgorithm(Graph graph) {

		DepthFirstOrder dfs = new DepthFirstOrder(graph.getTransposedGraph());
		marked = new boolean[graph.getVertexList().size()];

		for (Vertex vertex : dfs.getReversePost()) {
			if (!marked[vertex.getId()]) {
				dfs(vertex);
				count++;
			}
		}
	}
	
	private void dfs(Vertex vertex){
		marked[vertex.getId()]=true;

		vertex.setComponentId(count);
		for(Vertex v:vertex.getAdjacenciesList()){
			if(!marked[v.getId()]){
				dfs(v);
			}
		}
	}

}
