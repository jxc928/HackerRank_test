package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class BiggerIsGreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			char[] word = sc.next().toCharArray();
			// find the last adjacent two element that is in ascending order
			// 找到最后一个相邻正序
			int j = word.length - 1;
			while (j > 0 && word[j - 1] >= word[j]) {
				j--;
			}

			// if the sequence is already in descending order, reverse the whole
			// sequence
			// 如果i==0则说明已经是倒序，下一个字典排序应该是所有字母颠倒位置。(这里输出no answer即可)
			if (j == 0) {
				// reverse(word, 0, word.length - 1);
				System.out.println("no answer");
				continue;
			}

			// find the last element that is larger than word[i-1]
			// 找到最后一个在较小数之后切大于该数的值
			int k = word.length - 1;
			while (k >= j && word[j - 1] >= word[k]) {
				k--;
			}

			// exchange word[j-1] and word[k]
			// 交换第k的值与j-1的值
			char temp = word[j - 1];
			word[j - 1] = word[k];
			word[k] = temp;

			// reverse the sequence after j-1
			// 翻转位于j-1之后的所有字母
			reverse(word, j, word.length - 1);
			System.out.println(word);
		}
	}

	public static void reverse(char[] word, int start, int end) {
		while (start < end) {
			char temp = word[start];
			word[start] = word[end];
			word[end] = temp;
			start++;
			end--;
		}
	}
}
