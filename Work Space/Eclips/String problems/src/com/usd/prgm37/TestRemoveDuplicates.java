package com.usd.prgm37;

import java.util.Scanner;

public class TestRemoveDuplicates {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=kb.nextLine();
		System.out.println("enter another string");
		String s2=kb.nextLine();
		RemoveDuplicatesInTwoStrings.removeDuplicates(s1,s2);
	}

}
