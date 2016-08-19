package com.jack.algorithms.Implementation;

import java.util.Scanner;

/**
 * 15 puzzle solution: https://www.youtube.com/watch?v=TKXiHdgOHaU
 * @author Jiangxc
 * 
 * in this case:
 * 1. count the number of smaller than the current one for each index;
 * 2. add all counted numbers:
 * 		odd: no solution;
 * 		even: have solution
 *
 */
public class LarrysArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//num of test cases
		for(int i=0; i<t; i++){
			int n = sc.nextInt();//size of A
			int[] A = new int[n+1];
			for(int j=1; j<=n; j++){
				A[j] = sc.nextInt();
			}
			
			//process
			int count = 0;
			for(int j=1; j<=n-1; j++){
				for(int k=j+1; k<=n; k++){
					if(A[j]>A[k])
						count += 1;
				}
			}
			
			//output
			if(count % 2 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}