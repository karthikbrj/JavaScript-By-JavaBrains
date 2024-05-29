package com.usd.string5;

public class Lexicography {
	public static void isLexicography(String str, String s) {
		int result = str.compareToIgnoreCase(s);
		if (result == 0) {
			System.out.println("lexicography");
		} else if (result < 0) {
			System.out.println("String str is less than s");
		} else {
			System.out.println("String s is less than str");
		}

	}

}
