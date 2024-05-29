package com.usd.prgm43;

import java.util.Scanner;

public class TestRemoveCharacter {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter a character ");
		char c=kb.next().charAt(0);
		RemoveCharacter.removeCharacter(s, c);
	}

}
