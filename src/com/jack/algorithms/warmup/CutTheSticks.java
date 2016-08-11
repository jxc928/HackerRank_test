package com.jack.algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<arr.size(); i++){
			if(arr.get(0) == 0){
				arr.remove(0);
				i = -1;
				continue;
			}
			System.out.println(arr.size());
			int min = arr.get(0);
			for(int j=0; j<arr.size(); j++){
				arr.set(j, arr.get(j) - min);
			}
		}
	}
}
