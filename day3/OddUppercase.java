package com.org.testleaf.week2.day3;

import java.util.Scanner;

public class OddUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to be changed: ");
		String test = sc.next();
		char[] a = test.toCharArray();
		System.out.print("Do you wanna change odd or even positions: ");
		String cs = sc.next();
		if (cs.equalsIgnoreCase("even")) {
			for (int i = 0; i < test.length(); i += 2) {
				a[i] = Character.toUpperCase(a[i]);
			}
			String evenOutput = new String(a);
			System.out.println(evenOutput);

		} else if (cs.equalsIgnoreCase("odd")) {
			for (int i = 1; i < test.length(); i += 2) {
				a[i] = Character.toUpperCase(a[i]);
			}
			String oddOutput = new String(a);
			System.out.println(oddOutput);

		} else
			System.out.println("Invalid case change request");
		sc.close();
	}
}
