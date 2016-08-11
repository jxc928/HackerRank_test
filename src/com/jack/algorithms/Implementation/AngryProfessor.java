package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();//number of cases
		
		for(int i=0; i<caseNum; i++){
			int n, k;
			n = sc.nextInt();
			k = sc.nextInt();
			int negCount = 0;
			for(int j=0; j<n; j++){
				if(sc.nextInt() <= 0){
					negCount ++;
				}
			}
			if(negCount < k){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
