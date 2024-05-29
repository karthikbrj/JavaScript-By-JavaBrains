package com.usd.string7;

public class MiddleCharacter {
	public static void findMiddleCharacter(String s) {
		if (s.length() % 2 == 0) {
			System.out.println(
					"midle elements are " + s.charAt(s.length() / 2) + " and " + s.charAt((s.length() / 2) - 1));
		} else {
			System.out.println("midle element is " + s.charAt(s.length() / 2));
		}

	}

}
