package com.jack.algorithms.Implementation;

import java.util.Scanner;
import java.util.TreeSet;

public class ManasaAndStones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n, a, b;
			n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			
			TreeSet<Integer> set = new TreeSet<>();
			for(int j=0; j<n; j++){
				int sum = j*a + (n-1-j)*b;
				set.add(sum);
			}
			for (Integer integer : set) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}
}
