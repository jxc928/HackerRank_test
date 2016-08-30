package com.jack.algorithms.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * 难！不理解
 * @author Jack
 *
 */
public class Difficult_Solved_StringConstruction {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] inputArray = new String[n];
		for(int i=0; i<n; i++){
			inputArray[i] = sc.next();
		}
		
		//process
		for(String string : inputArray){
			String[] arr = string.split("(?!^)");
			Set<String> letters = new HashSet<>(Arrays.asList(arr));
			System.out.println(letters.size());
		}
	}
}
