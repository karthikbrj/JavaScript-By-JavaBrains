package com.usd.prgm66;

public class ReversByRecursion {
	public static void byRecursion(String s) {
		
		String[] arr=s.split("[.]");
		int len=arr.length-1;
		String s1=recursion(arr,len);
		System.out.println(s1);
		
	}
	public static String recursion(String[] s,int len) {
		if(len<0) {
			return "";
		}else {
			return s[len]+"."+recursion(s,len-1);
		}
	}

}