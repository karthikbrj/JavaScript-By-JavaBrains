package com.usd.prgm52;

import java.util.Scanner;

public class TestFindGood {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=kb.nextLine();
		System.out.println("enter another string");
		String s2=kb.nextLine();
		FindGood.checkGood(s1, s2);
	}

}
