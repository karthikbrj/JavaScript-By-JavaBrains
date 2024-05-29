package com.usd.string4;

public class Lexicographical {
	public static void isLexicography(String str,String s) {
		int result=str.compareTo(s);
		if(result==0) {
			System.out.println("lexicography");
		}
		else if(result<0) {
			System.out.println("String str is less than s");
		}
		else {
			System.out.println("String s is less than str");
		}
		
	}

}
