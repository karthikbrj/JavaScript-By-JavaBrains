package com.usd19;

import java.util.Scanner;

public class TestCompare {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		System.out.println("enter another String");
		String str=kb.nextLine();
		boolean b=Compare2Strings.compareStrings(s, str);
		System.out.println(b);
		
	}

}
