package com.us.string10;

public class PassWordValidity {
	public static String checkPasswordValidity(String s) {
		boolean digit = false;
		boolean upper_case = false;
		boolean lower_case = false;
		boolean special_character = false;
		boolean space = true;
		boolean flag = false;
		if (s.length() >= 8 && s.length()<=15) {
			char[] crr = s.toCharArray();
			for (int i = 0; i < crr.length; i++) {
				int n = (int) (crr[i]);
				if (n == 32) {
					space = false;
				}
				if (n >= 65 && n <= 90) {
					upper_case = true;
				}
				if (n >= 97 && n <= 122) {
					lower_case = true;
				}
				if (n >= 33 && n <= 47 || n >= 58 && n <= 64 || n >= 91 && n <= 96) {
					special_character = true;
				}
				if (n >= 48 && n <= 57) {
					digit = true;
				}
				if (upper_case && lower_case && special_character && digit) {
					flag = true;
				}
			}
			return "valid";
		} else {
			 throw new IllegalArgumentException("invalid Password and re-enter password");
		}
	}

}
