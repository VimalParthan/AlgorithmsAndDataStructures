import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

	private List<Vertex> vertexList;
	private PriorityQueue<Vertex> heap;
	
	public PrimsAlgorithm(Graph graph){
		this.vertexList = graph.getVertices();
		this.heap = new PriorityQueue<>();
	}
	
	public void spanningTree(){
		for(Vertex vertex: vertexList){
			if(!vertex.isVisitied()){
				makePrims(vertex);
			}
		}
	}
	
	private void makePrims(Vertex vertex){
		vertex.setDistance(0);
		heap.add(vertex);
		
		while(!heap.isEmpty()){
			Vertex v = heap.remove();
			scanVertices(v);
		}
	}
	
	private void scanVertices(Vertex vertex){
		
		vertex.setVisitied(true);
		
		for(Edge edge: vertex.getAdjacentEdges()){
			Vertex w = edge.getTargetVertex();
			
			if(w.isVisitied()) continue;
			
			if(edge.getWeight()<w.getDistance()){
				w.setDistance(edge.getWeight());
				w.setMinEdge(edge);
			}
			
			if(this.heap.contains(w)){
				this.heap.remove(w);
			}
			
			this.heap.add(w);
		}
		
	}
	
	public void showMST(){
		for(Vertex vertex: vertexList){
			if(vertex.getMinEdge()!=null){
				Edge e = vertex.getMinEdge();
				System.out.println("Edge: "+e.getStartVertex()+"-"+e.getTargetVertex());
			}
		}
	}
}
