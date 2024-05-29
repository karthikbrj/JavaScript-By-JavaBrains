package com.usd.prgm35;

import java.util.Scanner;

public class TestNonRepeating {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		NonRepeating.printNonRepeatingCharacter(s);
	}

}
