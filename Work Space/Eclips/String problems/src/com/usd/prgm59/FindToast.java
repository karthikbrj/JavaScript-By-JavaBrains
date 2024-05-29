package com.usd.prgm59;

public class FindToast {
	public static void findAndPrint(String s) {
		int n=s.indexOf("toast");
		int n1=s.lastIndexOf("toast");
		System.out.println(n);
		System.out.println(n1);
		String s1=s.substring(n+5, n1);
		System.out.println(s1);
	}

}
