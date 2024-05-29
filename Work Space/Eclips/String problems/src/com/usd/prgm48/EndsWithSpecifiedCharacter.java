package com.usd.prgm48;

public class EndsWithSpecifiedCharacter {
	public static boolean checkEndCharaters(String s1,String s2) {
		String s3=s1.substring((s1.length()-2), (s1.length()));
		if(s3.equals(s2)) {
			return true;
		}else {
			return false;
		}
	}

}
