package com.usd.prgm26;

import java.util.Scanner;

public class TestSubString {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String str=kb.nextLine();
		System.out.println("enter start index");
		int a=kb.nextInt();
		System.out.println("enter end index");
		int b=kb.nextInt();
		SubString.findSubString(str, a, b);
	}

}
