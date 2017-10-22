import java.util.List;

public class FlowNetwork {
	
	private List<Vertex> vertexList;
	
	private int sourceIndex;
	
	private int  sinkIndex;
	
	public FlowNetwork(List<Vertex> vertexList, int sourceIndex, int sinkIndex) {
		super();
		this.vertexList = vertexList;
		this.sourceIndex = sourceIndex;
		this.sinkIndex = sinkIndex;
	}

	public Vertex getSource() {
		return vertexList.get(sourceIndex);
	}

	public Vertex getSink() {
		return vertexList.get(sinkIndex);
	}

	public void addVetex(Vertex vertex){
		this.vertexList.add(vertex);
	}
	
	public int getNumberOfVertices(){
		return this.vertexList.size();
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}
	
	public void addEdge(Edge edge){
		vertexList.get(vertexList.indexOf(edge.getStartVertex())).addEdge(edge);
	}

}
