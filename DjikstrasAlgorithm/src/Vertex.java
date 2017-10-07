import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private List<Edge> neighbouringEdges;
	private int distance = Integer.MAX_VALUE;
	private Vertex predecessar;
	
	
	public Vertex(String name) {
		this.name = name;
		this.neighbouringEdges = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getNeighbouringEdges() {
		return neighbouringEdges;
	}

	public void setNeighbouringEdges(List<Edge> neighbouringEdges) {
		this.neighbouringEdges = neighbouringEdges;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public void addNeighbour(Edge edge){
		this.neighbouringEdges.add(edge);
	}

	public Vertex getPredecessar() {
		return predecessar;
	}

	public void setPredecessar(Vertex predecessar) {
		this.predecessar = predecessar;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Vertex o) {
		
		return Integer.compare(this.distance, o.getDistance());
	}

	
	
	

}
