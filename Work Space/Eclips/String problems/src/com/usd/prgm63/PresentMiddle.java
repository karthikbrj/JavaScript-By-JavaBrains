package com.usd.prgm63;

public class PresentMiddle {
	public static boolean check(String s1,String s2) {
		int length=s2.length();
		int n=s1.indexOf(s2);
		String s3=s1.substring(0, n);
		String s4=s1.substring(n+length, s1.length());
		if(s3.length()==s4.length()) {
			return true;
		}else {
			return false;
		}
		
	}

}
