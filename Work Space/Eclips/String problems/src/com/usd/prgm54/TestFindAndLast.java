package com.usd.prgm54;

import java.util.Scanner;

public class TestFindAndLast {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		FindLastAndFirstCharacter.checkFirstAndLast(s);
	}

}
