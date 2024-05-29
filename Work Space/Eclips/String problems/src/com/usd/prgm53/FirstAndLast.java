package com.usd.prgm53;

public class FirstAndLast {
	public static boolean checkLastandFirst2Characters(String s) {
		String s1 = s.substring(0, 2);
		String s2 = s.substring(s.length() - 2, s.length());
		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}
	}

}
