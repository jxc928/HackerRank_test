package com.jack.algorithms.Strings;

import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		
		//process
		boolean isPangram = true;
		if(str.length() < 26){
			isPangram = false;
		}else{
			boolean[] allLetters = new boolean[26];
			for(int i=0; i<allLetters.length; i++){
				allLetters[i] = false;
			}
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) != 32){//32 is space key
					allLetters[str.charAt(i) - 97] = true;//97 is a
				}
			}
			for(int i=0; i<allLetters.length; i++){
				if(!allLetters[i])
					isPangram = false;
			}
		}
		
		//output
		if(isPangram)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
 