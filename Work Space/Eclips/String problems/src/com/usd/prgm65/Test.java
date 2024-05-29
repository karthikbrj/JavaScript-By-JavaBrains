package com.usd.prgm65;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		System.out.println("enter number of characters");
		int n=kb.nextInt();
		System.out.println("enter nuber of times to repeat");
		int rep=kb.nextInt();
		RepeatSpecificNumber.repeatNumberOfTimes(s, n, rep);
	}

}
