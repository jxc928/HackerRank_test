package com.jack.algorithms.Strings;

import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] inputArray = new String[t];
		for(int i=0; i<t; i++)
			inputArray[i] = sc.next();
		
		//process
		for (String str : inputArray) {
			StringBuffer reverse = new StringBuffer(str);
			String revStr = reverse.reverse().toString();
			
			boolean isFunny = true;
			for(int i=1; i<str.length(); i++){
				if(Math.abs((str.charAt(i)-str.charAt(i-1))) != Math.abs((revStr.charAt(i)-revStr.charAt(i-1)))){
					isFunny = false;
					break;
				}
			}
			if(isFunny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
	}
}
