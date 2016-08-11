package com.jack.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
//        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < nums; i++){
        	sum += sc.nextInt();
        }
        System.out.println(sum);
	}
}
