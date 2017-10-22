
public class Edge {

	private Vertex startVertex;
	private Vertex targetVertex;
	private double availableFlow;
	private double flowUsed;

	public Edge(Vertex startVertex, Vertex targetVertex, double capacity) {
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.availableFlow=capacity;
	}


	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	public double getAvailableFlow() {
		return availableFlow;
	}
	
	public void decrementAvailableFlow(double value){
		this.availableFlow-=value;
	}
	
	public void incrementFlowUsed(double value){
		this.flowUsed+=value;
	}

	public void setAvailableFlow(double availableFlow) {
		this.availableFlow = availableFlow;
	}


	@Override
	public String toString() {
		return startVertex + "-" + targetVertex + "-" + flowUsed + "/" + (flowUsed+availableFlow);
	}


	
}
