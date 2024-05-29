package com.usd.prgm43;

public class RemoveCharacter {
	public static void removeCharacter(String s,char ch) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				continue;
			}else {
				System.out.print(s.charAt(i));
			}
		}
		
	}

}
