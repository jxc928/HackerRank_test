package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class TheTimeInWords {
	public static final String unit[] = { " o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty" };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();

		// HashMap<Integer,String> inWords = new HashMap<Integer,String>();
		// inWords.put(0," o' clock");
		if (m == 0)
			System.out.println(unit[h] + unit[0]);
		else if (m == 15)
			System.out.println("quarter past " + unit[h]);
		else if (m >= 1 && m <= 20)
			System.out.println(unit[m] + " minutes past " + unit[h]);
		else if (m > 20 && m < 30)
			System.out.println(unit[20] + " " + unit[m - 20] + " minutes past " + unit[h]);
		else if (m == 30)
			System.out.println("half past " + unit[h]);
		else if (m >= 31 && m <= 39)
			System.out.println(unit[20] + " " + unit[(60 - m) % 20] + " minutes to " + unit[h + 1]);
		else if (m == 40)
			System.out.println(unit[20] + " minutes to " + unit[h + 1]);
		else if (m >= 41 && m < 45 || m > 45)
			System.out.println(unit[60 - m] + " minutes to " + unit[h + 1]);
		else if (m == 45)
			System.out.println("quarter to " + unit[h + 1]);
	}
}
