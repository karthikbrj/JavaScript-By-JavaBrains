package com.usd.prgm16;

import java.util.Scanner;

public class TestCharacterArray {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		CharacterArray.printCharArray(s);
	}

}
