package com.jack.test;

import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] reminder = new int[k];
		int[] tar_set = new int[n];
		// input
		for (int i = 0; i < n; i++) {
			tar_set[i] = sc.nextInt() % k;
		}
		//统计相同余数的个数
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				if (tar_set[j] == i)
					reminder[i]++;
			}
		}
		//k是奇数
		if (k % 2 == 1) {
			for (int i = 1; i < Math.ceil((double) k / 2); i++) {
				count = count + Math.max(reminder[i], reminder[k - i]);
			}
			if (reminder[0] != 0)
				count++;
			System.out.print(count);
		}
		//k是偶数
		if (k % 2 == 0) {
			for (int i = 1; i < k / 2; i++) {
				count = count + Math.max(reminder[i], reminder[k - i]);
			}
			if (reminder[k / 2] != 0)
				count++;
			if (reminder[0] != 0)
				count++;
			System.out.print(count);
		}
	}
}