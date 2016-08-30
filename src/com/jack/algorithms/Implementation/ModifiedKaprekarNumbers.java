package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int lowest = sc.nextInt();
		int highest = sc.nextInt();
		
		//process
		boolean ifExist = false;
		for(int i=lowest; i<=highest; i++){
			long num = (long) Math.pow(i, 2);
			String str = "" + num;
			
			if(str.length()<2){
				if(i == num){
					System.out.print(i + " ");
					ifExist = true;
				}
			}else{
				String str1 = str.substring(0, str.length()/2);
				String str2 = str.substring(str.length()/2, str.length());
				if((Integer.parseInt(str1) + Integer.parseInt(str2)) == i){
					System.out.print(i + " ");
					ifExist = true;
				}
			}
		}
		if(!ifExist)
			System.out.println("INVALID RANGE");
	}
}
