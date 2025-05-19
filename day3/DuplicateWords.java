package com.org.testleaf.week2.day3;

public class DuplicateWords {
	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println("Input text is : " + text);
		int count = 0;
		String[] input = text.split(" ");
		int size = input.length;

		for (int i = 0; i < size; i++) {
			if (input[i].equals(""))
				continue;
			for (int j = i + 1; j < size; j++) {
				if (input[i].equalsIgnoreCase(input[j])) {

					input[j] = "";
					count++;
				}
			}
		}

		System.out.println("Duplicate words count is: " + count);
		System.out.print("Input text is : ");
//		System.out.println(Arrays.toString(input));
		System.out.println(String.join(" ", input));

	}

}
