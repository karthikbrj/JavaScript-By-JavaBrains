package com.usd.prgm54;

public class FindLastAndFirstCharacter {
	public static void checkFirstAndLast(String s) {
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			System.out.println(s.substring(1, s.length()-1));
		}else {
			System.out.println(s);
		}
		
	}

}
