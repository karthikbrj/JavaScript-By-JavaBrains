package com.usd.prgm35;

public class NonRepeating {
	public static void printNonRepeatingCharacter(String s) {
		char crr[] = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < crr.length; i++) {
			int count = 1;
			for (int j = 0; j < crr.length; j++) {
				if (crr[i] == crr[j] && i != j) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(crr[i]);
			}
		}

	}

}
