package com.usd.string5;

import java.util.Scanner;

import com.usd.string4.Lexicographical;

public class TestLexicography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		kb.nextLine();
		System.out.println("enter another String");
		String a=kb.nextLine();
		Lexicographical.isLexicography(s, a);

	}

}
