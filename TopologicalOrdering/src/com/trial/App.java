package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		TopologicalOrdering to =new TopologicalOrdering();
		List<Vertex> graph = new ArrayList<>();

		graph.add(new Vertex("0"));
		graph.add(new Vertex("1"));
		graph.add(new Vertex("2"));
		graph.add(new Vertex("3"));
		graph.add(new Vertex("4"));
		graph.add(new Vertex("5"));
			
		graph.get(2).addVertex(graph.get(3));
		graph.get(3).addVertex(graph.get(1));
		graph.get(5).addVertex(graph.get(0));
		graph.get(5).addVertex(graph.get(2));
		graph.get(4).addVertex(graph.get(0));
		graph.get(4).addVertex(graph.get(1));
		
		for(Vertex v:graph){
			if(!v.isVistied()){
				to.dfs(v);
			}
		}
		
		Stack <Vertex> vertexStack = to.getVertexStack();
		
		for(int i=0;i<graph.size();i++){
			System.out.print(vertexStack.pop().getData()+"->");
		}
		
		
	}

}
