package com.jack.algorithms.Strings;

import java.util.Scanner;

public class GemStones {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] inputArray = new String[n];
		for(int i=0; i<n; i++){
			inputArray[i] = sc.next();
		}
		
		//process
		int count = 0;
		int[] countForEach = new int[26];
		for(int i=0; i<26; i++){
			countForEach[i] = 0;
		}
		for (int i=0; i<inputArray.length; i++) {
			String string = inputArray[i];
			for(int j=0; j<string.length(); j++){
				if(countForEach[string.charAt(j) - 97] == i)
					countForEach[string.charAt(j) - 97] += 1;
			}
		}
		for(int i=0; i<26; i++){
			if(countForEach[i] == n)
				count += 1;
		}
		//output
		System.out.println(count);
	}
}
