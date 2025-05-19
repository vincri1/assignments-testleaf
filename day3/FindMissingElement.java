package com.org.testleaf.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for (int j = 0; j < n; j++) {
			if (a[j] != (j + 1)) {
				System.out.println("Missing Number is: " + (j + 1));
				break;
			}
		}
		sc.close();
	}
}
