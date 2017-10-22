package com.trial;

public class Node {
	
	private int index;
	private int rank;
	private Node previousNode;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	public Node(int index, int rank, Node previousNode) {
		super();
		this.index = index;
		this.rank = rank;
		this.previousNode = previousNode;
	}
	

}
