package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] n = new int[t];
		for(int i=0; i<t; i++){
			n[i] = sc.nextInt();
		}
		
		//process
		for (int i : n) {
			int count = 0;
			int r = i;
			while(r > 0){
				if(r%10 != 0 && i%(r%10) == 0)
					count ++;
				r /= 10;
			}
			//output
			System.out.println(count);
		}
	}
}
