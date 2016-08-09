package com.jack.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] A = {a0, a1, a2};
        int[] B = {b0, b1, b2};
        int AliceP = 0;
        int BobP = 0;
        for(int i=0; i<3; i++){
            if(A[i] == B[i]){
                continue;
            }else if(A[i] > B[i]){
                AliceP ++;
            }else{
                BobP ++;
            }
        }
        System.out.print(AliceP + " " + BobP);
	}
}
