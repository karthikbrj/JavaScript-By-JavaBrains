package com.usd.prgm62;

public class FindString {
	public static boolean checkGivenSubstring(String s,String ch) {
		int n=s.indexOf('.');
		String s1=s.substring(0, n);
		if(s1.contains(ch)) {
			return true;
		}else {
			return false;
		}
		
	}

}
