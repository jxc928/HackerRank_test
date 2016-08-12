package com.jack.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		double positive = 0;
		double negativi = 0;
		double zeroes = 0;
		for(int i=0; i<num; i++){
			int in = sc.nextInt();
			if(in > 0){
				positive ++;
			}else if(in < 0){
				negativi ++;
			}else{
				zeroes ++;
			}
		}
		
		
		DecimalFormat df =new DecimalFormat("#.000000");
		System.out.println(df.format(positive/num));
		System.out.println(df.format(negativi/num));
		System.out.println(df.format(zeroes/num));
	}
}
