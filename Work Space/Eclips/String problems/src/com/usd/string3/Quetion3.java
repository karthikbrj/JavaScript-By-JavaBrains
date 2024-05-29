package com.usd.string3;

public class Quetion3 {
	public static void getcharacterbeforeSpecifiedIndex(String s,int n) {
		char[] crr = s.toCharArray();
		int index = n;
		System.out.println("code point index " + index + " and unicode before index character is " + s.charAt(index - 1)
				+ " and unicode is " + s.codePointBefore(index));
	}

}
