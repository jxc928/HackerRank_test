package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class ACMICPCTeam {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//number of people
		int m = sc.nextInt();//number of topics
		String[] personKnow = new String[m];
		for(int i=0; i<n; i++){
			personKnow[i] = sc.next();
		}
		
		//process
		int maxNum = 0;
		int maxTeam = 0;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				int numOfKnow = checkTopics(personKnow[i], personKnow[j], m);
				if(maxNum < numOfKnow){
					maxNum = numOfKnow;
				}
			}
		}
		
		//output
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				int numOfKnow = checkTopics(personKnow[i], personKnow[j], m);
				if(maxNum == numOfKnow){
					maxTeam += 1;
				}
			}
		}
		System.out.println(maxNum);
		System.out.println(maxTeam);
	}
	
	public static int checkTopics(String first, String second, int m){
		int numOfKnow = 0;
		for(int i=0; i<m; i++){
			if(first.charAt(i) == '1' || second.charAt(i) == '1'){
				numOfKnow += 1;
			}
		}
		
		return numOfKnow;
	}
}
