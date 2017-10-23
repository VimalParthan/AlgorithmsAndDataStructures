package com.trial;

public class Node {
	
	private int rank;
	private int index;
	private Node previousNode;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	public Node(int rank, int index, Node previousNode) {
		this.rank = rank;
		this.index = index;
		this.previousNode = previousNode;
	}
	
	
}
