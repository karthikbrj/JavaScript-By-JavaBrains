package com.usd.prgm61;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter a character");
		char ch=kb.next().charAt(0);
		boolean b=FindString.checkStringAndPrint(s, ch);
		System.out.println(b);
	}

}
