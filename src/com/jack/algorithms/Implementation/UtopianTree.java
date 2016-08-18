package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] N = new int[T];
		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();
		}

		// process
		for (int i : N) {
			int height = 0;
			if (i % 2 == 0)
				height = (int) (Math.pow(2, i / 2) - 1) * 2 + 1;
			else
				height = (int) (Math.pow(2, i / 2 + 1) - 1) * 2;

			System.out.println(height);
		}
	}
}
