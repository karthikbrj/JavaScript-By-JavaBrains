package com.usd.string2;

import java.util.Scanner;

public class TestQuetion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		System.out.println("enter the index number");
		int a=kb.nextInt();
		Quetion2.findUnicode(a, s);
	}

}
