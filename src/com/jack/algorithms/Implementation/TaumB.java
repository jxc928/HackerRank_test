package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class TaumB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            //process
            long normal = (b*x) + (w*y);
            long other = x>y?((y*w)+(y+z)*b):((b*x)+(z+x)*w);
            
            //output
            if(normal > other)
            	System.out.println(other);
            else
            	System.out.println(normal);
        }
	}
}
