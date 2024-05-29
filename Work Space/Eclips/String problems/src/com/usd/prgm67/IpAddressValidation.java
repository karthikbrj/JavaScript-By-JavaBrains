package com.usd.prgm67;

public class IpAddressValidation {
	public static void validate(String s) {
		boolean flag = false;
		String s1[] = s.split("[.]");
		if (s1.length == 4) {
			for (int i = 0; i < s1.length; i++) {
				if (s1[i].length() == 3) {
					int a = Integer.parseInt(s1[i]);
					if ((a >= 0) && (a <= 255)) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}else {
					flag=false;
					break;
				}
			}
			if (flag) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");

			}
		} else {
			System.out.println("invalid");
		}
	}
}