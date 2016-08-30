package com.jack.algorithms.Strings;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		//input
		Scanner in = new Scanner(System.in);
        String s = in.next();
        
        //process
        int count = 0;
        for(int i=0; i<s.length(); i++){
        	if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        		count ++;
        	}
        }
        if(s.length() > 0)
        	count ++;
        System.out.println(count);
	}
}
