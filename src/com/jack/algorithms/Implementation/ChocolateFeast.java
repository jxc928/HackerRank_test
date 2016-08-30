package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//trip
		for(int i=0; i<t; i++){
			int n, c, m;
			n = sc.nextInt();//money
			c = sc.nextInt();//price
			m = sc.nextInt();//wrappers number can trade
			
			int totalChocs = n / c;
			int totalWappers = totalChocs;
			int freeChocs = 0;
			while(totalWappers >= m){
				
				freeChocs =totalWappers / m;
				totalWappers = freeChocs + (totalWappers % m);
				totalChocs += freeChocs;
			}
			System.out.println(totalChocs);
		}
	}
}
