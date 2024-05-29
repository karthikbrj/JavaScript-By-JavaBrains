package com.usd.prgm59;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		FindToast.findAndPrint(s);
	}

}
