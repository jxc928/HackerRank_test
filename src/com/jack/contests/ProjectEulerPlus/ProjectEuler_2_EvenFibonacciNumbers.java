package com.jack.contests.ProjectEulerPlus;

import java.util.Scanner;

public class ProjectEuler_2_EvenFibonacciNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T = sc.nextLong();
		for(long i=0; i<T; i++){
			long N = sc.nextLong();
			
			long a = 1;
			long b = 2;
			long sum = 2;
			while(true){
				long c = 3*b + 2*a;
				if(c>=N)
					break;
				sum += c;
				
				a = 2*b+a;
				b = c;
			}
			System.out.println(sum);
		}
	}
}
