package com.jack.algorithms.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger bi = BigInteger.valueOf(1);
		
		
		for(int i=1; i<=n; i++){
			bi = bi.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(bi);
	}
}
