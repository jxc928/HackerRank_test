package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class SaveThePrisoner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int N, M, S; 
			N = sc.nextInt();
			M = sc.nextInt();
			S = sc.nextInt();
			
			int save = (M + S-1) % N;
			if(save == 0){
				System.out.println(N);
			}else{
				System.out.println(save);
			}
			
		}
	}
}
