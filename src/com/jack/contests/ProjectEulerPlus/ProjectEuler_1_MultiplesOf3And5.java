package com.jack.contests.ProjectEulerPlus;

import java.util.Scanner;

public class ProjectEuler_1_MultiplesOf3And5 {
	public static void main(String[] args) {
		/**
		 * this works, but some cases get timeout error
		 */
//		Scanner sc = new Scanner(System.in);
//		long T = sc.nextInt();
//		for(long i=0; i<T; i++){
//			long N = sc.nextInt();
//			
//			long num = 3;
//			long sum = 0;
//			while(num < N){
//				if(num%3==0){
//					sum += num;
//					num += 3;
//				}
//			}
//			
//			num = 5;
//			while(num < N){
//				if(num%5==0){
//					sum += num;
//					num += 5;
//				}
//			}
//			
//			num = 15;
//			while(num < N){
//				if(num%15==0){
//					sum -= num;
//					num += 15;
//				}
//			}
//			
//			System.out.println(sum);
//		}
		
		/**
		 * best one: using summation formula
		 */
		Scanner sc = new Scanner(System.in);
		long T = sc.nextInt();
		for(long i=0; i<T; i++){
			long N = sc.nextInt();
			
			long sum = 0;
			long p = (N-1) / 3;
			sum = 3*p*(p+1) / 2;
			
			p = (N-1) / 5;
			sum = sum + 5*p*(p+1) / 2;
			
			p = (N-1) / 15;
			sum = sum - 15*p*(p+1) / 2;
			
			System.out.println(sum);
		}
	}
}
