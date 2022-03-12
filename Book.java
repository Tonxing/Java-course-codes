package com.mmtonsing.oops;

public class Book {
	private int noOfCopies;
	
	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	public int getCopies() {
		return noOfCopies;
	}
	
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
}
