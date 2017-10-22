package com.trial;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TarjanAlgorithm {

	private List<Vertex> vertexList;
	private List<List<Vertex>> components;
	private int lowLinkCount;
	private Stack<Vertex> vertexStack;

	public TarjanAlgorithm(List<Vertex> vertexList) {
		super();
		this.vertexList = vertexList;
		this.components = new ArrayList<>();
		vertexStack= new Stack<>();
	}

	public void runAlgorithm() {
		for (Vertex vertex : vertexList) {
			if (!vertex.isVisited()) {
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		vertex.setLowLink(lowLinkCount++);
		vertexStack.push(vertex);

		boolean isComponentRoot = true;

		for (Vertex v : vertex.getAdjacentVertices()) {
			if (!v.isVisited()) {
				dfs(v);
				
			}

			if (v.getLowLink() < vertex.getLowLink()) {
				vertex.setLowLink(v.getLowLink());
				isComponentRoot = false;
			}
		}

		if (isComponentRoot) {
			Vertex currentVertex ;
			List<Vertex> component = new ArrayList<>();
			while (true) {
				currentVertex=vertexStack.pop();
				currentVertex.setLowLink(Integer.MAX_VALUE);
				component.add(currentVertex);
				
			
				if(currentVertex.getName().equals(vertex.getName()))break;
				
			}
			components.add(component);
		}
	}
	
	public void showComponents(){
		System.out.println(components);
	}

}
