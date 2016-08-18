package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class FairRations {
	public static void main(String[] args) {
		//input
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        
        //process
        int count = 0;
        for(int i=0; i<N; i++){
        	if(B[i]%2 == 0){
        		continue;
        	}
        	if(i == N-1){
        		System.out.println("NO");
        		return;
        	}
        	B[i] += 1;
        	B[i+1] += 1;
        	count += 2;
        }
        System.out.println(count);
	}
}
