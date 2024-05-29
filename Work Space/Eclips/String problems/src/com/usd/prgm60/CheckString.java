package com.usd.prgm60;

public class CheckString {
	public static boolean checkGivenString(String s1,String s2) {
		int n=s2.lastIndexOf(s1);
		if(n>0) {
			return true;
		}else {
			return false;
		}
	}

}
