package com.org.testleaf.week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input, output = 0, temp = 0;
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		temp = input;

		for (int i = temp; i != 0; i /= 10) {
			int reverse = i % 10;
//			System.out.print(reverse + "\t");
			output = output * 10 + reverse;
//			System.out.print(output + "\t");
		}
		if (input == output)
			System.out.println("Number " + input + " is palindrome");
		else
			System.out.println("Number " + input + " is not palindrome");
		sc.close();
	}

}