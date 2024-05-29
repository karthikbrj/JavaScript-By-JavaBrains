package com.usd.prgm25;

import java.util.Scanner;

public class TestReplaceString {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String str=kb.nextLine();
		System.out.println("enter old String to replace");
		String s=kb.nextLine();
		System.out.println("enter new string to repalace");
		String s1=kb.nextLine();
		ReplaceString.replaceOldStringWithNewString(str, s,s1);
	}

}