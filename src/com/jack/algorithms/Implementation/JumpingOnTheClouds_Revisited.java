package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class JumpingOnTheClouds_Revisited {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int energy = 100;
        for(int i=0; i<n; i=k+i){
        	if(c[i] == 0)
        		energy -= 1;
        	else
        		energy -= 3;
        }
        System.out.println(energy);
	}
}
