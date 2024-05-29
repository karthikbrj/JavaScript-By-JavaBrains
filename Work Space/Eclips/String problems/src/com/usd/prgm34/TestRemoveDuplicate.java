package com.usd.prgm34;

import java.util.Scanner;

public class TestRemoveDuplicate {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		RemoveDuplicates.removeDuplicatesAndPrint(s);
	}

}
