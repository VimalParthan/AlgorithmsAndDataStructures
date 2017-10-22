package com.trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

	
	
	public void minimumSpanningTree(List<Vertex> vertexList,List<Edge> edgeList){
		
		DisjointSet disjointSet = new DisjointSet(vertexList);
		
		Collections.sort(edgeList);
		List<Edge> mst =new ArrayList<>();
		for(Edge edge:edgeList){
			Vertex u = edge.getStartVertex();
			Vertex v = edge.getTargetVertex();
			
			if(disjointSet.find(u.getNode())!=disjointSet.find(v.getNode())){
				disjointSet.join(u.getNode(), v.getNode());
				mst.add(edge);
			}
		}
		
		for(Edge edge:mst){
			System.out.println(edge.getStartVertex()+"-"+edge.getTargetVertex());
		}
		
	}
	
	

}
