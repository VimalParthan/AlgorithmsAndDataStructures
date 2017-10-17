import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacencies;

	public Vertex(String name){
		this.name = name;
		this.adjacencies = new ArrayList<>();
	}
	
	public void addEdge(Edge edge){
		this.adjacencies.add(edge);
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Edge> adjacencies) {
		this.adjacencies = adjacencies;
	}
	
	
}
