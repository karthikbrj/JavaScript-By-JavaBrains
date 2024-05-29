package com.usd.prgm56;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("entr a string");
		String s=kb.nextLine();
		FirstTwoCharacters.checkFirstAndPrint(s);
	}

}
