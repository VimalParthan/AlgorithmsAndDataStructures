import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson {

	private double maxFlowValue;
	private FlowNetwork flowNetwork;
	private Vertex sink;
	private Vertex source;
	private Edge[] edgeTo;
	private boolean [] visited;


	public FordFulkerson(FlowNetwork flowNetwork) {
		super();
		this.flowNetwork = flowNetwork;
		this.sink = flowNetwork.getSink();
		this.source = flowNetwork.getSource();
		this.edgeTo = new Edge[flowNetwork.getNumberOfVertices()];
	}

	public void runAlgorithm() {
		
		while (hasAugmentedPath()) {
			double pathFlow = Double.POSITIVE_INFINITY;
			
			
			for (Vertex currentVertex=sink;currentVertex!=source;currentVertex=edgeTo[currentVertex.getIndex()].getStartVertex()) {
				pathFlow = Math.min(pathFlow,edgeTo[currentVertex.getIndex()].getAvailableFlow());
			}

			for (Vertex currentVertex=sink;currentVertex!=source;currentVertex=edgeTo[currentVertex.getIndex()].getStartVertex()) {
				edgeTo[currentVertex.getIndex()].decrementAvailableFlow(pathFlow);
				edgeTo[currentVertex.getIndex()].incrementFlowUsed(pathFlow);
			}
			maxFlowValue = maxFlowValue + pathFlow;
		}
		
		displayVerticesInMinCut();
	}
	
	

	private void displayVerticesInMinCut() {
		System.out.println("Vertices in Mincut");
		for(Vertex vertex : flowNetwork.getVertexList()){
			if(visited[vertex.getIndex()]){
				System.out.print(vertex+"--");
			}
		}
		System.out.println();
	}

	public double getMaxFlow() {
		return this.maxFlowValue;
	}

	private boolean hasAugmentedPath() {

		int numberOfVertices = flowNetwork.getNumberOfVertices();
		
		visited = new boolean[numberOfVertices];
		
		visited[flowNetwork.getSource().getIndex()] = true;
		
		Queue<Vertex> vertexQueue= new LinkedList<>();
		
		vertexQueue.offer(source);
		
		while(!vertexQueue.isEmpty()){
			
			Vertex currentVertex = vertexQueue.remove();
		
				for(Edge edge:currentVertex.getAdjacentEdges()){
					if(edge.getAvailableFlow()>0&&!visited[edge.getTargetVertex().getIndex()]){
						vertexQueue.offer(edge.getTargetVertex());
						visited[edge.getTargetVertex().getIndex()]=true;
						
						edgeTo[edge.getTargetVertex().getIndex()]=edge;
					}
				}
			
			
		}

		return visited[flowNetwork.getSink().getIndex()];
	}

}
