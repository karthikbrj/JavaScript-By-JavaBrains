package com.usd.prgm28;

import java.util.Scanner;

public class TestTrim {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		Trim.trimleadingAndTrailingSpaces(s);
	}

}
