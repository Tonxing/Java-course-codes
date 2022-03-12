package com.mmtonsing.oops;

public class BookRunner{
	public static void main(String[] args) {
		Book doEpicShit = new Book(50);
		Book science = new Book(75);
		Book computer = new Book(100);
		System.out.println(science.getCopies());
		System.out.println(computer.getCopies());
		System.out.println(doEpicShit.getCopies());
	}
}
