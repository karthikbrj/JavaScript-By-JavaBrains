package com.usd.string4;

import java.util.Scanner;

public class TestLexicograpical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		System.out.println("enter another String");
		String a=kb.nextLine();
		Lexicographical.isLexicography(s, a);

	}

}
