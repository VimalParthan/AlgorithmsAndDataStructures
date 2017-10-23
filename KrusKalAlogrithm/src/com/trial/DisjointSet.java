package com.trial;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	
	private List<Node> rootNodes;
	private int nodeCount;
	private int setCount;
	
	public DisjointSet(List<Vertex> vertexList) {
		rootNodes = new ArrayList<>();
		makeSets(vertexList);
	}
	
	public void join(Node n1,Node n2){
		
		int index1 = find(n1);
		int index2 = find(n2);
		
		if(index1==index2) return;
		
		Node rootNode1 =rootNodes.get(index1);
		Node rootNode2 = rootNodes.get(index2);
		
		if(rootNode1.getRank()>rootNode2.getRank()){
			rootNode2.setPreviousNode(rootNode1);
		}else if(rootNode2.getRank()>rootNode1.getRank()){
			rootNode1.setPreviousNode(rootNode1);
		}else{
			rootNode2.setPreviousNode(rootNode1);
			rootNode1.setRank(rootNode1.getRank()+1);
		}
		
		setCount--;
	}

	public int find(Node n){
		
		Node currentNode = n;
		
		while(currentNode.getPreviousNode()!=null){
			currentNode = currentNode.getPreviousNode();
		}
		
		Node rootNode = currentNode;
		currentNode = n;
		
		while(currentNode.getIndex()!=rootNode.getIndex()){
			Node temp = currentNode.getPreviousNode();
			currentNode.setPreviousNode(rootNode);
			currentNode = temp;
		}
		
		return rootNode.getIndex();
	}
	
	private void makeSets(List<Vertex> vertexList){
		
		for(Vertex vertex : vertexList){
			makeSet(vertex);
		}
	}
	
	private void makeSet(Vertex vertex){
		Node n = new Node(0,rootNodes.size(),null);
		vertex.setNode(n);
		rootNodes.add(n);
		setCount++;
		nodeCount++;
		
	}
	
	
	

}
