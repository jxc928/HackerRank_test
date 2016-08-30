package com.jack.algorithms.Strings;

import java.util.Scanner;

/**
 * 交替的字符
 * @author Administrator
 *
 */
public class ReplaceChar {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] inputArray = new String[t];
		for(int i=0; i<t; i++){
			inputArray[i] = sc.next();
		}
		
		//process
		for (String string : inputArray) {
			int size = string.length();
			int counter = 0;
			int i, j;
			for(i=0, j=size-1; i+1<j-1; i++, j--){
				if(string.charAt(i) == string.charAt(i+1))
					counter ++;
				if(string.charAt(j) == string.charAt(j-1))
					counter ++;
			}
			
			if(size%2 == 0){//should compare i and j
				if(string.charAt(i) == string.charAt(j))
					counter ++;
			}else{//the center one should compare with left and right one
				if(string.charAt(i) == string.charAt(i++))
					counter ++;
				if(string.charAt(j) == string.charAt(j-1))
					counter ++;
			}
			//output
			System.out.println(counter);
		}
	}
}
