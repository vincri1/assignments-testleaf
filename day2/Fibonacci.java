package com.org.testleaf.week1.day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, temp = 0;
		System.out.print("Enter the Range: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Fibonacci Series: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a + "\t");

			temp = a + b;
			a = b;
			b = temp;
		}
		sc.close();
	}

}
