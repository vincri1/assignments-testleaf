package com.org.testleaf.week1.day2;

public class Library {

	public static void main(String[] args) {
		System.out.println(addBook("Hope"));
		System.out.println(issueBook());
		Library lib = new Library();
		String bookName = lib.addBook("Faith");
		System.out.println(bookName);
		System.out.println(lib.issueBook());
	}

	public static String issueBook() {

		return "Book issued successfully";
	}

	public static String addBook(String title) {
		// TODO Auto-generated method stub
		System.out.println("Book added successfully");
		return title;
	}
}
