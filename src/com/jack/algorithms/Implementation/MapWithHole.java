package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class MapWithHole {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] map = new String[n];
		for(int i=0; i<n; i++){
			map[i] = sc.next();
		}
		
		//process
		for(int i=1; i<n-1; i++){
			for(int j=1; j<n-1; j++){
				if(map[i].charAt(j)>map[i-1].charAt(j) && map[i].charAt(j)>map[i+1].charAt(j) 
						&& map[i].charAt(j)>map[i].charAt(j-1) && map[i].charAt(j)>map[i].charAt(j+1))
					map[i] = map[i].substring(0, j) + "X" + map[i].substring(j+1);
			}
		}
		
		//output
		for(int i=0; i<n; i++){
			System.out.println(map[i]);
		}
	}
}
