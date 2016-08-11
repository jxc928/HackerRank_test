package com.jack.algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 该方法不行，溢出，，，要直接计数
 * 参看 com.jack.test.NonDivisibleSubset.java
 * @author Administrator
 *
 */
public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		// input
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			// A+B is divisible by k if (A%k)+(B%k)=k
			list.add(sc.nextInt() % k);
		}

		// There is also a special case where both A & B are evenly divisible,
		// giving a sum of 0
		if (list.contains(0)) {
			while(Collections.frequency(list, 0) >= 2){
				list.remove(0);
			}
		}
		
		// For even values of K, the equal remainder is simular to the 0 case.
		if (k % 2 == 0) {
			while(Collections.frequency(list, k/2) >= 2){
				list.remove(k/2);
			}
		}
		
		//统计各个数的个数
		Map<String, Integer> countMap = new HashMap<>();
		for(int i=0; i<list.size(); i++){
			int key = list.get(i);
			if(countMap.containsKey(Integer.toString(key))){
				countMap.put(Integer.toString(key), countMap.get(Integer.toString(key)) + 1);
			}else{
				countMap.put(Integer.toString(key), 1);
			}
		}
		
		//删除不符合条件的数
		for(int i=1; i<=k/2; i++){
			while(countMap.containsKey(Integer.toString(i)) && countMap.containsKey(Integer.toString(k-i))){
				if(countMap.get(Integer.toString(i)) == countMap.get(Integer.toString(k-i)) ){
					countMap.put(Integer.toString(k-i), countMap.get(Integer.toString(k-i)) - 1);
				}
				if(countMap.get(Integer.toString(i)) > countMap.get(Integer.toString(k-i))){
					if(countMap.get(Integer.toString(k-i)) <= 1){
						countMap.remove(Integer.toString(k-i));
					}else{
						countMap.put(Integer.toString(k-i), countMap.get(Integer.toString(k-i)) - 1);
					}
				}else{
					if(countMap.get(Integer.toString(i)) <= 1){
						countMap.remove(Integer.toString(i));
					}else{
						countMap.put(Integer.toString(i), countMap.get(Integer.toString(i)) - 1);
					}
				}
			}
		}

		int count = 0;
		for (Entry<String, Integer> entry : countMap.entrySet()) {
			count += entry.getValue();
		}
		System.out.println(count);
	}
}
