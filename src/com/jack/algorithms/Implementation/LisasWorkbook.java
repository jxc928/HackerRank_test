package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class LisasWorkbook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// the number of chapters
		int k = sc.nextInt();// the maximum number of problems per page respectively
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		
		int count = 0;//special prob
		int pageNo = 1;//page no.
		int probNo;//prob no.
		for (int i = 0; i < n; i++) {
			for(probNo=1; probNo<=t[i]; probNo++){
				if(pageNo == probNo){
					count += 1;
				}
				if((probNo<t[i]) && (probNo%k==0)){
					pageNo += 1;
				}
			}
			//access to next chapter
			pageNo += 1;
		}
		System.out.println(count);
	}
}
