package com.usd.prgm24;

import java.util.Scanner;

public class TestStringReplace {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter old character to replace");
		char c=kb.next().charAt(0);
		System.out.println("enter new character to replace");
		char ch=kb.next().charAt(0);
		StirngReplace.replaceOldByNewCharacter(s,c,ch);
	}

}
