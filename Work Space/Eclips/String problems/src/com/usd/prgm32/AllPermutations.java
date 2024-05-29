package com.usd.prgm32;

public class AllPermutations {
	public static void printAllPermutations(String s1,String s2) {
		if(s1.length()==s2.length()) {
			System.out.println(s2);
			return;
		}
		for(int i=0;i<s1.length();i++) {
			printAllPermutations(s1,s2+s1.charAt(i));
		}
	}

}
