package com.usd17;

public class StringEnds {
	public static void checkends(String s, String str) {
		char[] srr = s.toCharArray();
		char[] strr = str.toCharArray();
		if (srr[srr.length - 1] == strr[strr.length - 1]) {
			if (srr[srr.length - 2] == strr[strr.length - 2]) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}

	}

}
