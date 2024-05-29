package com.usd.prgm58;

import java.util.Scanner;

public class TestFindCharacter {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		FindCharacter.checkAndREmove(s);
	}

}
