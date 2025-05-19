package com.org.testleaf.week2.day3;

public class ReverseWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] splitInput = test.split(" ");
		int size = splitInput.length;

		for (int i = 0; i < size; i++) {
			String splitWord = splitInput[i];

			if (i % 2 == 1) {
				char[] chars = splitWord.toCharArray();
				int l = chars.length;
				char[] reversed = new char[l];

				for (int j = 0; j < l; j++) {
					reversed[j] = chars[l - 1 - j];
				}

				splitWord = new String(reversed);
			}

			System.out.print(splitWord + " ");
		}
	}
}
