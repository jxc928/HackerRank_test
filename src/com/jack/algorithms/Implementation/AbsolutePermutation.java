package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class AbsolutePermutation {
	public static void main(String[] args) {
		//input
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            int[] num = new int[n];
            for(int i=0,z=1; i<n; i++,z++){
            	num[i] = z;
            }
            //process
            if(k == 0){
            	for (int i=0; i<num.length; i++) {
					System.out.print(num[i]);
					if(i != num.length - 1)
						System.out.print(" ");
				}
            	System.out.println();
            	continue;
            }else if(n%(2*k) != 0){
            	System.out.println(-1);
            	continue;
            }else{
            	changePlace(num, k);
            }
            //output
            for (int i=0; i<num.length; i++) {
				System.out.print(num[i]);
				if(i != num.length - 1)
					System.out.print(" ");
			}
        	System.out.println();
        }
	}
	
	//换2k个数的位置。
	public static void changePlace(int[] num, int k){
		int preIndex = 0;
		while(preIndex < num.length){
			int index = preIndex;
			for(int i=0; i<k; i++){
				int temp = num[index];
				num[index] = num[index + k];
				num[index + k] = temp;
				index += 1;
			}
			
			preIndex += 2 * k;
		}
	}
}
