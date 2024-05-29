package com.usd.prgm36;

public class NequalParts {
	public static void printEqualParts(String s, int n) {
		int len = s.length();
		int ch=s.length()/n;
		if (len % n != 0) {
			System.out.println("string cannot divide  "+n+" equal parts");
		}
		else {
			for(int i=0;i<s.length();i=i+ch) {
				String s1=s.substring(i, i+ch);
				System.out.println(s1);
			}
		}
	}

}
