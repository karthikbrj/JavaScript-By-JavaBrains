package com.usd.prgm58;

public class FindCharacter {
	public static void checkAndREmove(String s) {
		int n=s.indexOf('#');
		int n1=s.indexOf('#', n);
		if(s.charAt(n)=='#') {
			System.out.println(s.substring(0, n-1)+s.substring(n+2, s.length()));
		}else {
			System.out.println(s);
		}
	}

}
