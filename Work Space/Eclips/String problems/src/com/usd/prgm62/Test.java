package com.usd.prgm62;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=kb.nextLine();
		System.out.println("enter string to search");
		String s2=kb.nextLine();
		boolean b=FindString.checkGivenSubstring(s1, s2);
		System.out.println(b);
	}

}
