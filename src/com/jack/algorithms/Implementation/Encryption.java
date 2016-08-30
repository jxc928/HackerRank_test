package com.jack.algorithms.Implementation;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		
		//process
		int length = str.length();
		int rows = (int) Math.ceil(Math.sqrt(length));
		String[] lines;
		if(rows * (rows-1) >= length){
			lines = new String[rows - 1];
		}else{
			lines = new String[rows];
		}
		
		for(int i=0; i<lines.length; i++){
			if(i != lines.length - 1)
				lines[i] = str.substring(i * rows, (i+1) * rows);
			else
				lines[i] = str.substring(i * rows, length);
		}
		
		//output
		for(int i=0; i<rows; i++){
			for(int j=0; j<lines.length; j++){
				if((j == 0 && (i+1) <= length) || (j*rows+(i+1) <= length))
					System.out.print(lines[j].charAt(i));
			}
			System.out.print(" ");
		}
	}
}
