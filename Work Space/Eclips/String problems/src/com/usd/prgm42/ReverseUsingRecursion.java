package com.usd.prgm42;

public class ReverseUsingRecursion {
	public static void reverseAndPrint(String s) {
		String s1=recursion(s,(s.length()-1));
		System.out.print(s1);
	}
	public static String recursion(String s,int i) {
		if(i<0) {
			return "" ;
		}else 
			 return s.charAt(i)+recursion(s,i-1);
		
	}

}
