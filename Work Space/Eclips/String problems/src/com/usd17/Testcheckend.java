package com.usd17;

import java.util.Scanner;

public class Testcheckend {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter another string");
		String str=kb.nextLine();
		StringEnds.checkends(s, str);
	}

}
