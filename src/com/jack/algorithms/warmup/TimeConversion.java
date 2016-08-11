package com.jack.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String timeStr = sc.next();
		char[] inchar = timeStr.toCharArray();
		char[] out = Arrays.copyOfRange(inchar, 0, 8);
		if(inchar[8] == 'A' && timeStr.substring(0, 2).equals("12")){
			out[0] = '0';
			out[1] = '0';
		}
		if(inchar[8] == 'P' && !timeStr.substring(0, 2).equals("12")){
			String hh = "" + (Integer.parseInt(timeStr.substring(0, 2)) + 12);
			char[] hhchar = hh.toCharArray();
			out[0] = hhchar[0];
			out[1] = hhchar[1];
		}
		System.out.println(out);
	}
}
