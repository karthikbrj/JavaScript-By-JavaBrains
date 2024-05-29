package com.usd.prgm47;

public class SwapLastTwoCharacter {
	public static void swaplast2Characters(String s) {
		String s2=s.substring(0, (s.length()-2))+s.charAt(s.length()-1)+s.charAt(s.length()-2);
		System.out.println(s2);
	}

}
