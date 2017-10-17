package com.trial;

public class Node {
	
	private int rank;
	private int index;
	private Node parent;

	public Node(int rank, int index, Node parent) {
		super();
		this.rank = rank;
		this.index = index;
		this.parent = parent;
	}

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
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	

}
