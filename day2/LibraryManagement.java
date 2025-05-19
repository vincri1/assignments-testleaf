package com.org.testleaf.week1.day2;

public class LibraryManagement {
	public static void main(String[] args) {
		Library lb = new Library();
		lb.addBook("Dream");
		System.out.println(lb.issueBook());
	}
}
