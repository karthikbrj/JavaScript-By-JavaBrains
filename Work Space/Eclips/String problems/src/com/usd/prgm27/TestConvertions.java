package com.usd.prgm27;

import java.util.Scanner;

public class TestConvertions {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter another string");
		String s1=kb.nextLine();
		Convertions.convertTOLowerCase(s);
		Convertions.convertTOUpeerCase(s1);
	}

}
