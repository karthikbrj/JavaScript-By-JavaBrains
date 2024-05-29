package com.usd.string3;

import java.util.Scanner;

public class TestQuetion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		System.out.println("enter the index number");
		int a=kb.nextInt();
		Quetion3.getcharacterbeforeSpecifiedIndex(s,a);

	}

}
