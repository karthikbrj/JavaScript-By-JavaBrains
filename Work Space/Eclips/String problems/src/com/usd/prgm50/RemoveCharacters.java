package com.usd.prgm50;

public class RemoveCharacters {
	public static void checkLength(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			String s3=s1.substring(s2.length()-1, s1.length());
			System.out.println(s3+" "+s2);
		}else {
			System.out.println(s1+" "+s2);
		}
	}

}
