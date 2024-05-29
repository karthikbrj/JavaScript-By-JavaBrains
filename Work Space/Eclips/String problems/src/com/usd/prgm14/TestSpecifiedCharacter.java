package com.usd.prgm14;

import java.util.Scanner;

public class TestSpecifiedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter a string to search");
		String str=kb.nextLine();
		SpecifiedCharacter.checkSpecifiedCharacter(s, str);
		//System.out.println(b);

	}

}
