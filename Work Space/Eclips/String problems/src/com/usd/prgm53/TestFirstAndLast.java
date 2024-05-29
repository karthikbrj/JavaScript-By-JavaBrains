package com.usd.prgm53;

import java.util.Scanner;

public class TestFirstAndLast {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		boolean b=FirstAndLast.checkLastandFirst2Characters(s);
		System.out.println(b);
	}

}
