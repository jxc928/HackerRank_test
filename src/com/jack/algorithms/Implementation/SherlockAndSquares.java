package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class SherlockAndSquares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
			double a = sc.nextInt();
			double b = sc.nextInt();
			int count = 0;
			
			//大于该数的最小整数
			a = Math.ceil(Math.sqrt(a));
			//小于该数的最大整数
	        b = Math.floor(Math.sqrt(b));
	        int result = (int) (b-a) +1;

	        if(result<0)
	            result=0;
	        System.out.println(result);
			
	        //隐式转换会超时
//			for(double j=a; j<=b; j++){
//				double sqrt = Math.sqrt(j);
//				if(sqrt - (long)sqrt == 0)
//					count += 1;
//			}
//			System.out.println(count);
		}
	}
}
