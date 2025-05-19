package com.org.testleaf.week2.day3;

public class FindIntersection {
	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 }, b = { 1, 2, 8, 4, 9, 7 };
		System.out.println("Matching number between Arrays: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					System.out.println(a[i]);

			}
		}
	}
}
