package com.jack.contests.ProjectEulerPlus;

import java.util.Scanner;

public class ProjectEuler_4_LargestPalindromeProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int k=0; k<T; k++){
			long N = sc.nextLong();
			System.out.println(findPalindrome3(N));
		}
	}
	
	/**
	 * findPalindrome1(int N)
	 * i,j bian li 999~100.ci fang fa xiaolv zui di
	 * @param N
	 * @return
	 */
	private static int findPalindrome1(int N){
		int prod=0,a=0;
		
		for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                prod=i*j;
                int num=prod;
                int reversenum=0;
                while(num!=0){
                    reversenum=reversenum*10+num%10;
                    num=num/10;
                }
                if(prod==reversenum && prod<N)
                	if(prod>a)
                		a=prod;
            }
        }
		return a;
	}
	
	/**
	 * findPalindrome2(int N)
	 * 
	 * j zhi xunhuan dayu i de shu.xiaolv tigao 
	 * @param N
	 * @return
	 */
	private static int findPalindrome2(int N){
		int prod=0,a=0;
		
		for(int i=999;i>=100;i--){
            for(int j=999;j>=i;j--){
                prod=i*j;
                int num=prod;
                int reversenum=0;
                while(num!=0){
                    reversenum=reversenum*10+num%10;
                    num=num/10;
                }
                if(prod==reversenum && prod<N)
                	if(prod>a)
                		a=prod;
            }
        }
		return a;
	}
	
	/**
	 * findPalindrome3(int N)
	 * BEST METHOD!!!!!
	 * 
	 * abccba  
     * 		= a*100000 + b*10000 + c*1000 + c*100 + b*10 +a*1
     *		= a*(100001) + b*(10010) + c*(1100)
     * 		= 11*(9091*a + 910*b + 100*c)
     * dui yu ben ti :liang ge 3weishu de chengji ji:
     * 		= 11 * x * y
     * 		= (11*x) * y
	 *	其中： 
	 *	  99 < 11*x, y <= 999
	 *	  9  <     x   <= 90
	 *	  99 <     y   <= 999
     * 
	 * @param N
	 * @return
	 */
	private static long findPalindrome3(long N){
		long f=0;
		for(int a=9; a>=0; a--){
			for(int b=9; b>=0; b--){
				for(int c=9; c>=0; c--){
					long num = 9091*a + 910*b + 100*c;
					if(num*11 < N){
						for(int x=90; x>=10; x--){
							if(num%x==0 && num/x > 99 && num/x <= 999){
								return num * 11;
							}
						}
					}
				}
			}
		}
		return f;
	}
}
