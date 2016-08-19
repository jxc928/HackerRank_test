package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int actDay, actMonth, actYear, expDay, expMonth, expYear;
		actDay = sc.nextInt();
		actMonth = sc.nextInt();
		actYear = sc.nextInt();
		expDay = sc.nextInt();
		expMonth = sc.nextInt();
		expYear = sc.nextInt();
		
		//process
		int fine = 0;
		if(actYear > expYear){
			fine = 10000;
		}else if(actYear == expYear){
			if(actMonth > expMonth){
				fine = 500 * (actMonth-expMonth);
			}else if(actMonth == expMonth){
				if(actDay > expDay){
					fine = 15 * (actDay-expDay);
				}
			}
		}
		System.out.println(fine);
	}
}
