package com.trial;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkersonAlgorithm {
	
	private FlowNetwork flowNetwork;
	
	private boolean [] visited;
	
	private Edge[] edgeToSource;
	
	private double maxFlowValue;
	
	public FordFulkersonAlgorithm(FlowNetwork flowNetwork){
		this.flowNetwork = flowNetwork;
		edgeToSource = new Edge[flowNetwork.getNumberOfVertices()];
	}
	
	public void runAlgorithm(){
		
		double flowValue = Double.POSITIVE_INFINITY;
		
		Vertex sink = flowNetwork.getSink();
		
		Vertex source = flowNetwork.getSource();
		
		while(hasAugmentedPath()){
			flowValue = Double.POSITIVE_INFINITY;
			for(Vertex v = sink;v!=source;v=edgeToSource[v.getIndex()].getStartVertex()){
				flowValue = Double.min(flowValue, edgeToSource[v.getIndex()].getAvailableFlow());
			}
			
			for(Vertex v = sink;v!=source;v=edgeToSource[v.getIndex()].getStartVertex()){
				edgeToSource[v.getIndex()].decrementAvailableFlow(flowValue);
				edgeToSource[v.getIndex()].incrementFlowUsed(flowValue);
			}
			
			maxFlowValue +=flowValue;
		}
		
		displayVerticesInMinimumCut();
		
	}
	
	public double getMaxFlow(){
		return maxFlowValue;
	}

	private void displayVerticesInMinimumCut() {
		System.out.println("Vertices in minimum cut");
		for(Vertex vertex:flowNetwork.getVertexList()){
			if(visited[vertex.getIndex()]){
				System.out.print(vertex+"--");
			}
		}
		System.out.println();
	}

	private boolean hasAugmentedPath() {
		
		visited = new boolean [flowNetwork.getNumberOfVertices()];
		
		Queue<Vertex> vertexQueue = new LinkedList<>();
		
		vertexQueue.add(flowNetwork.getSource());
		
		visited[flowNetwork.getSource().getIndex()] = true;
		
		while(!vertexQueue.isEmpty()){
			Vertex currentVertex = vertexQueue.poll();
			for(Edge edge:currentVertex.getAdjacentEdges()){
				Vertex w= edge.getTargetVertex();
				if(edge.getAvailableFlow()>0&&!visited[w.getIndex()]){
					vertexQueue.add(w);
					visited[w.getIndex()]=true;
					edgeToSource[w.getIndex()]=edge;
				}
			}
		}
		
		return visited[flowNetwork.getSink().getIndex()];
	}
	
	

}
