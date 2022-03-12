package com.mmtonsing.oops;

public class Flight {
	
	private int serialNo;
	
	Flight(){
		this(0);
	}
	
	Flight(int serialNo){
		this.serialNo = serialNo;
	}
	
	public int getSerialNo() {
		return serialNo + 1;
	}
}
