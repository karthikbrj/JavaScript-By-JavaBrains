package com.usd.string21;

import java.util.Scanner;

public class TestUniqueIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter another string");
		String s1=kb.nextLine();
		System.out.println("enter another string");
		String s2=kb.nextLine();
		UniqueIdentifier.printIdentifier(s, s1, s2);
		kb.close();
		

	}

}
