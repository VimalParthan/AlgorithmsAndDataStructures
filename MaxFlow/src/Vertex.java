import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Edge> adjacentEdges;	
	private int index;
	
	public Vertex(String name, int index){
		this.name = name;
		this.adjacentEdges = new ArrayList<>();
		this.index = index;		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getAdjacentEdges() {
		return adjacentEdges;
	}

	public void setAdjacentEdges(List<Edge> adjacentEdges) {
		this.adjacentEdges = adjacentEdges;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void addEdge(Edge edge){
		this.adjacentEdges.add(edge);
	}

	
}
