package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        for(int c_i=0; c_i < n;){
        	if(c_i<n-2 && c[c_i+2] == 0){
        		c_i = c_i + 2;
        	}else{
        		c_i = c_i + 1;
        	}
        	count += 1;
        	if(c_i == n - 1){
        		break;
        	}
        }
        System.out.println(count);
	}
}
