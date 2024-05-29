package com.usd.prgm30;

import java.util.Scanner;

public class TestCountSequence {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		CountSequence.countCharactersInSequence(s);
	}

}
