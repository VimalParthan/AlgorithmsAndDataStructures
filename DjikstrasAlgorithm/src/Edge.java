
public class Edge {
	
	private Vertex startingVertex;
	private Vertex endVertex;
	private int weight;
	
	public Edge( int weight,Vertex startingVertex, Vertex endVertex) {
		super();
		this.startingVertex = startingVertex;
		this.endVertex = endVertex;
		this.weight = weight;
	}
	public Vertex getStartingVertex() {
		return startingVertex;
	}
	public void setStartingVertex(Vertex startingVertex) {
		this.startingVertex = startingVertex;
	}
	public Vertex getEndVertex() {
		return endVertex;
	}
	public void setEndVertex(Vertex endVertex) {
		this.endVertex = endVertex;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
