package com.jack.algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulTriplets {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		List<Integer> seq = new ArrayList<>();
		for(int i=0; i<n; i++){
			seq.add(sc.nextInt());
		}
		
		//process
		int count = 0;
		for(int i=0; i<n-2; i++){
			int firNum = seq.get(i);
			if(seq.contains(firNum + d) && seq.contains(firNum + 2 * d)){
				count += 1;
			}
		}
		System.out.println(count);
	}
}