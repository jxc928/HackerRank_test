package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class NewYearChaos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			//input one test
			int n = sc.nextInt();
			int[] X = new int[n];
			for(int j=0; j<n; j++){
				X[j] = sc.nextInt();
			}
			
			//process one test
			int count = 0;
			for(int k=n-1; k>0; k--){
				int chanCount = 0;
				if(X[k] < X[k-1]){
					changePlace(X, k, k-1);
					chanCount += 1;
					for(int z=k; z<n-1; z++){
						if(X[z] > X[z+1]){
							changePlace(X, z, z+1);
							chanCount += 1;
						}else{
							break;
						}
					}
					if(chanCount > 2){
						count = -1;
						break;
					}
					count += chanCount;
				}
			}
			if(count == -1){
				System.out.println("Too chaotic");
			}else{
				System.out.println(count);
			}
		}
	}
	
	public static void changePlace(int[] X, int x, int y){
		int temp = X[x];
		X[x] = X[y];
		X[y] = temp;
	}
}
