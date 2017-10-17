package com.trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {
	
	public void minimumSpanningTree(List<Vertex> vertices,List<Edge> edges){
		
		DisjointSet disjointSet = new DisjointSet(vertices);
		
		List<Edge> mst = new ArrayList<>();
		
		Collections.sort(edges);
		
		for(Edge edge: edges){
			
			Vertex u = edge.getStartVertex();
			Vertex v = edge.getTargetVertex();
			
			if(disjointSet.find(u.getNode())!=disjointSet.find(v.getNode())){
			
				mst.add(edge);
				disjointSet.join(u.getNode(), v.getNode());
				
			}
			
		}
		
		for(Edge edge : mst){
			System.out.println(edge.getStartVertex()+" "+edge.getTargetVertex()+"-->");
		}
		
		
	}

}
