package com.jack.algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] distance = new int[n];
		int[] space = new int[m];
		for(int i=0; i<m; i++){
			space[i] = sc.nextInt();
		}
		
		//process
		if(n == m){
			System.out.println(0);
			return;
		}
		
		for(int i=0; i<n; i++){
			int min = Integer.MAX_VALUE;
			for(int j=0; j<m; j++){
				if(space[j] == i){
					distance[i] = 0;
					break;
				}
				if(min > Math.abs(i-space[j])){
					min = Math.abs(i-space[j]);
				}
				distance[i] = min;
			}
		}
		Arrays.sort(distance);
		System.out.println(distance[n-1]);
	}
}
