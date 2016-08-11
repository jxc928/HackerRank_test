package com.jack.algorithms.warmup;

import java.util.Scanner;

public class SherlockAndWatson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, K, Q;
		N = sc.nextInt();
		K = sc.nextInt();
		Q = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[(i+K)%N] = sc.nextInt();
		}
		for(int i=0; i<Q; i++){
			System.out.println(arr[sc.nextInt()]);
		}
	}
}
