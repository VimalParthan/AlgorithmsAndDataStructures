import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private Edge minEdge;
	private double distance = Double.POSITIVE_INFINITY;
	private List<Edge> adjacentEdges;
	private boolean visitied;
	
	public Vertex(String name){
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
	}
	
	public boolean isVisitied() {
		return visitied;
	}

	public void setVisitied(boolean visitied) {
		this.visitied = visitied;
	}

	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Edge getMinEdge() {
		return minEdge;
	}

	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}

	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}

	@Override
	public String toString() {

		return this.name;
	}

	@Override
	public int compareTo(Vertex o) {

		return Double.compare(this.distance, o.getDistance());
	}
}
