package com.jack.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] matrix = new int[num][num];
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int priDiagonal = 0;
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				if(i == j){
					priDiagonal += matrix[i][j];
					break;
				}
			}
		}
		
		int secDiagonal = 0;
		int k = num;
		for(int i=0; i<num; i++){
			for(int j=k-1; j>=0;){
				secDiagonal += matrix[i][j];
				k -= 1;
				break;
			}
		}
		
		int dif = priDiagonal - secDiagonal;
		if(dif<0){
			dif = -dif;
		}
		System.out.println(dif);
	}
}
