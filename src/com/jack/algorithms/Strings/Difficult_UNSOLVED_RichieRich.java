package com.jack.algorithms.Strings;

import java.util.Scanner;

public class Difficult_UNSOLVED_RichieRich {
	public static void main(String[] args) {
		//input
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        
        //process
        int i,j;
        int halfIndex = number.length()/2;
        int counter = 0;
        for(i=halfIndex-1, j=halfIndex; i>=0; i--, j++){
        	if(number.charAt(i) > number.charAt(j)){
        		number.replace(number.charAt(j), number.charAt(i));
        	}else{
        		number.replace(number.charAt(i), number.charAt(j));
        	}
        	counter ++;
        }
        
        if(counter > k){
        	System.out.println(-1);
        }else{
        	System.out.println(number);
        }
	}
}
