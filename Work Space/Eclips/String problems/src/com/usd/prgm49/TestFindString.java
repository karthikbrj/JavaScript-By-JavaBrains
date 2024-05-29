package com.usd.prgm49;

import java.util.Scanner;

public class TestFindString {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		FindString.checkString(s);
	}

}
