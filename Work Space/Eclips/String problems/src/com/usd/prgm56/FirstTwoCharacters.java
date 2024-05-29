package com.usd.prgm56;

public class FirstTwoCharacters {
	public static void checkFirstAndPrint(String s) {
		if(s.charAt(0)==s.charAt(1)) {
			System.out.println(s.substring(2, s.length()));
		}else {
			System.out.println(s);
		}
	
}
}
