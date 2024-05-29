package com.usd.prgm23;

import java.util.Scanner;

public class TestStringLength {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		kb.nextLine();
		int n=StringLength.findStringLength(s);
		System.out.println(n);
	}

}
