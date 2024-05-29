package com.usd.prgm46;

public class CheckCharacters {
	public static void removeRepeatingCharacter(String s1,String s2) {
		if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
			String s3=s1.substring(0, (s1.length()-1))+s2;
			System.out.println(s3);
		}
		else {
			String s3=s1+s2;
			System.out.println(s3);
		}
	}

}
