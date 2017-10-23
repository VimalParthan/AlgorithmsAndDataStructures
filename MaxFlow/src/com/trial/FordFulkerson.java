package com.trial;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson {

	private boolean[] visited;
	private Edge[] edgeToSource;
	private FlowNetwork flowNetwork;
	private double maxFlow;

	public FordFulkerson(FlowNetwork flowNetwork){
		this.flowNetwork = flowNetwork;
		this.edgeToSource = new Edge[flowNetwork.getVertexList().size()];
	}
	
	public void runAlgorithm(){

		
		while(hasAugmentedPath()){
			
			double flow = Double.MAX_VALUE;
			
			for(Vertex v= flowNetwork.getSink();v!=flowNetwork.getSource();v=edgeToSource[v.getIndex()].getStartVertex()){

				flow = Math.min(flow, edgeToSource[v.getIndex()].getFlowRemaining());
			}
			
			for(Vertex v= flowNetwork.getSink();v!=flowNetwork.getSource();v=edgeToSource[v.getIndex()].getStartVertex()){
				edgeToSource[v.getIndex()].incrementFlowUsed(flow);
				edgeToSource[v.getIndex()].decrementFlowUsed(flow);
			}
			
			maxFlow+=flow;
		
		}
		
	}

	public void verticesInMinCut(){
		for(Vertex vertex : flowNetwork.getVertexList()){
			if(visited[vertex.getIndex()]){
				System.out.println(vertex);
			}
		}
	}
	
	public double getMaxFlow(){
		return maxFlow;
	}


	private boolean hasAugmentedPath() {
		
		visited= new boolean[flowNetwork.getVertexList().size()];
		
		Queue <Vertex> vertexQueue= new LinkedList<>();
		
		vertexQueue.add(flowNetwork.getSource());
		visited[flowNetwork.getSource().getIndex()]=true;
		
		while(!vertexQueue.isEmpty()&&!visited[flowNetwork.getSink().getIndex()]){
			Vertex currentVertex= vertexQueue.poll();
			for(Edge edge:currentVertex.getAdjacentEdges()){
				Vertex u = edge.getTargetVertex();
			
				if(edge.getFlowRemaining()>0&&!visited[u.getIndex()]){
				
					visited[u.getIndex()]=true;
					edgeToSource[u.getIndex()]=edge;
		
					vertexQueue.add(u);
				}
				
			}
		}
		
		return visited[flowNetwork.getSink().getIndex()];
	}

}
