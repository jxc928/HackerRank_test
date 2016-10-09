package com.jack.contests.ProjectEulerPlus;

import java.util.Scanner;

public class ProjectEuler_3_LargestPrimeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			long N = sc.nextLong();
			
			/*
			 * STEP-1: if the given N is even repeatedly divide by 2.
			 */
			while(N%2==0)
				N = N / 2;
			
			/*
			 * STEP-2: if the N becomes 1 return 2 which is the largest prime factor.
			 */
			if(N == 1){
				System.out.println(2);
				return;
			}
			
			/*
			 * STEP-3: start with i=3, and check if the N is divisible by i. 
			 * increment i by 2 (because there are no even factors for an odd number..). 
			 * run the loop till square root of the N. 
			 * if the N is divisible by i then divide the N by i and run the loop again from i =3. 
			 * this step will eliminate all the composite numbers.
			 */
			int j;
			for(j=3; j<=Math.sqrt(N); j+=2){
				while(N%j==0){
					N = N / j;
				}
//				if(N%j==0){
//					N = N / j;
//					j = 1;
//				}
			}
			
			/*
			 * STEP-4: finally if N is grater than 2 then its a prime number. return N. 
			 * else return i which is the largest prime number.
			 */
			if(N >= 2){
				System.out.println(N);
			}else{
				System.out.println(j);
			}
		}
	}
}
