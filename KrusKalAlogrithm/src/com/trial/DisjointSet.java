package com.trial;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	
	private int setCount;
	private int nodeCount;
	private List<Node> rootNodes;
	
	public DisjointSet(List<Vertex> vertices){
		this.rootNodes=new ArrayList<>(vertices.size());
		makeSets(vertices);
	}
	
	public int find(Node n){
		
		Node currentNode = n;
		
		while(currentNode.getParent()!=null){
			currentNode = currentNode.getParent();
		}
		
		Node rootNode = currentNode;
		
		currentNode=n;
		
		while(currentNode!=rootNode){
			Node temp = currentNode.getParent();
			currentNode.setParent(rootNode);
			currentNode = temp;
		}
		
		return rootNode.getIndex();
	}
	
	public void join(Node n1,Node n2){
		
		int index1 = find(n1);
		int index2 = find(n2);
		
		if(index1==index2) return;
		
		Node rootNode1 = rootNodes.get(index1);
		Node rootNode2 = rootNodes.get(index2);
		
		if(rootNode1.getRank()>rootNode2.getRank()){
			rootNode2.setParent(rootNode1);
		}else if(rootNode2.getRank()>rootNode1.getRank()){
			rootNode1.setParent(rootNode2);
		}else{
			rootNode2.setParent(rootNode1);
			rootNode1.setRank(rootNode1.getRank()+1);
		}
		setCount--;
	}
	
	private void makeSets(List<Vertex> vertices){
		
		for(Vertex vertex:vertices){
			makeSet(vertex);
		}
	}
	
	private void makeSet(Vertex vertex){
		
		Node n = new Node(0,rootNodes.size(),null);
		vertex.setNode(n);
		
		this.rootNodes.add(n);
		this.setCount++;
		this.nodeCount++;
		
	}
	

}
