package com.jack.algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlmostSorted {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		for(int i=1; i<=n; i++){
			d[i] = sc.nextInt();
		}

		//process
		int[] sorted = d.clone();
		Arrays.sort(sorted);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			if(d[i] != sorted[i]){
				list.add(i);
			}
		}
		
		//output
		if(list.size() == 2){
			System.out.println("yes");
			System.out.println("swap " + list.get(0) + " " + list.get(1));
		}else if(isDescending(Arrays.copyOfRange(d, list.get(0), list.get(list.size()-1) + 1))){//判断是否为降序数列
			System.out.println("yes");
			System.out.println("reverse " + list.get(0) + " " + list.get(list.size()-1));
		}else{
			System.out.println("no");
		}
		
	}
	
	public static boolean isDescending(int[] d){
		int temp = d[0];
		for(int i=1; i<d.length; i++){
			if(d[i] < temp)
				temp = d[i];
			else
				return false;
		}
		return true;
	}
}
