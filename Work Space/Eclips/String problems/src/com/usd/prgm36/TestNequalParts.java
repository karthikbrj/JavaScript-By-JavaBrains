package com.usd.prgm36;

import java.util.Scanner;

public class TestNequalParts {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=kb.nextLine();
		System.out.println("enter number of parts");
		int n=kb.nextInt();
		NequalParts.printEqualParts(s, n);
	}

}
