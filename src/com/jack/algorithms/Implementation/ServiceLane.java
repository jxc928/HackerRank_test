package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class ServiceLane {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] width = new int[n];
		for(int i=0; i<n; i++){
			width[i] = sc.nextInt();
		}
		for(int k=0; k<t; k++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			//process
			int min = 3;
			for(int l=i; l<=j; l++){
				if(width[l] < min){
					min = width[l];
				}
			}
			System.out.println(min);
		}
	}
}
