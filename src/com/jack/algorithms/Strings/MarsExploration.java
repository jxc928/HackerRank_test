package com.jack.algorithms.Strings;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		
		//process
		char[] sosMessage = {'S', 'O', 'S'};
		int counter = 0;
		for(int i=0; i<inputStr.length(); i++){
			if(inputStr.charAt(i) != sosMessage[i%3])
				counter ++;
		}
		
		//output
		System.out.println(counter);
	}
}
