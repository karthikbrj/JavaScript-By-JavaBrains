package com.usd.prgm48;

import java.util.Scanner;

public class TestEndsWithSpecifiedCharacter {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=kb.nextLine();
		System.out.println("enter another string ");
		String s2=kb.nextLine();
		boolean b=EndsWithSpecifiedCharacter.checkEndCharaters(s1, s2);
		System.out.println(b);
	}

}
