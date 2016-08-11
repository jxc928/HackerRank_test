package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, v1, x2, v2;
		x1 = sc.nextInt();
		v1 = sc.nextInt();
		x2 = sc.nextInt();
		v2 = sc.nextInt();
		
		if(v2-v1 == 0){
			System.out.println("NO");
		}else if(((x1-x2)%(v2-v1) == 0) && ((x1-x2)/(v2-v1) > 0)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
