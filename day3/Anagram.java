package com.org.testleaf.week2.day3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char ch1[] = text1.toCharArray();
			char ch2[] = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2) == true)
				System.out.println("The given strings are Anagram.");
			else
				System.out.println("The given strings are not an Anagram.");
		} else
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	}
}
