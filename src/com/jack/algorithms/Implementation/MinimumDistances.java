package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class MinimumDistances {
	public static void main(String[] args) {
		// input
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}

		// process
		int min = n;
		for (int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++){
				if(A[i] == A[j] && (j-i)<min){
					min = j - i;
				}
			}
		}
		// output
		if(min == n){
			System.out.println(-1);
		}else{
			System.out.println(min);
		}
	}
}
