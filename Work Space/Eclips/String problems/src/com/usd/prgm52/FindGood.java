package com.usd.prgm52;

public class FindGood {
	public static void checkGood(String s1,String s2) {
		String s=s1.substring(0,s2.length() );
		String s3=s1.substring(1,s2.length()+1);
		if(s2.equals(s) || s2.equals(s3)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}

}
