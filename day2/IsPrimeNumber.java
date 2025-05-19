package com.org.testleaf.week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {
	public static void main(String[] args) {

		int n, count = 0;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
		sc.close();
	}
}
