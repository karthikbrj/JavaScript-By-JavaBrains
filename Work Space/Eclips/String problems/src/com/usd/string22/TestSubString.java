package com.usd.string22;

import java.util.Scanner;

public class TestSubString {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter start index");
		int a=kb.nextInt();
		System.out.println("enter last index");
		int b=kb.nextInt();
		SubString.printString(s,a,b);

	}

}
