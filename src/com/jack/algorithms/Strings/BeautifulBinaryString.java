package com.jack.algorithms.Strings;

import java.util.Scanner;

public class BeautifulBinaryString {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] str = new char[n];
		str = sc.next().toCharArray();
		
		//process
		int count = 0;
		for(int i=1; i<str.length-1; i++){
			if(str[i] == '1' && str[i-1] == '0' && str[i+1] == '0'){
				str[i+1] = 1;
				count ++;
			}
		}
		System.out.println(count);
	}
}
