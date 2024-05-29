package com.usd.prgm65;

public class RepeatSpecificNumber {
	public static void repeatNumberOfTimes(String s,int n,int repeat) {
		String s1=s.substring(s.length()-n, s.length());
		for(int i=1;i<=repeat;i++) {
			System.out.print(s1);
		}
	}

}
